package fr.cytech.icc
package domain.tournament

import domain.tournament.Match.{MatchId, Player, Score}

import java.util.UUID

sealed trait Match
case class WaitingMatch(id: MatchId) extends Match

sealed case class FilledMatch(id: MatchId, players: List[Player]) extends Match
case class FinishedMatch(
                          id: MatchId,
                          playersWithScore: Map[Player, Score]
                        ) extends Match

object WaitingMatch {
  def apply: WaitingMatch = new WaitingMatch(UUID.randomUUID())
}

object Match {
  type MatchId = UUID
  type Player = String
  type Score = Int
  def winner(`match`: FinishedMatch): Player =
    `match`
      .playersWithScore
      .minBy(_._2)._1
}


