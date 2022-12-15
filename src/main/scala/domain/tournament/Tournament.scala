package fr.cytech.icc
package domain.tournament

import domain.tournament.Match.MatchId

import fr.cytech.icc.domain.tournament.Tournament.computeNumberOfMatchForPowerOfTwoPlayers

import scala.annotation.tailrec
import scala.math.{floor, log}

case class Tournament(tree: BTree[Match])

object Tournament {
  def log2(x: Double): Double = log(x) / log(2)
  def computeNumberOfMatchForPowerOfTwoPlayers(playerQuantity: Int): Option[Int] =
    Option.when(log2(playerQuantity.toDouble).isValidInt) {
      val n = playerQuantity / 2
      val layers = floor(log2(playerQuantity)).toInt
      layers * (n + 1) / 2
    }

  def createMatchs(maxDepth: Int)(actualDepth: Int): BTree[Match] =
    if (maxDepth == actualDepth) Leaf(WaitingMatch.apply)
    else {
      Node(
        WaitingMatch.apply,
        createMatchs(maxDepth)(actualDepth + 1),
        createMatchs(maxDepth)(actualDepth + 1)
      )
    }

  def createSingleBracketTournamentFromPlayerQuantity(playerQuantity: Int): Option[Tournament] = for {
    matchNumber <- computeNumberOfMatchForPowerOfTwoPlayers(playerQuantity)
  } yield {
    Tournament(createMatchs(matchNumber)(0))
  }

}