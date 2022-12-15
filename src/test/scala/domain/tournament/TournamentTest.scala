package fr.cytech.icc
package domain.tournament

import fr.cytech.icc.domain.tournament.Tournament.{computeNumberOfMatchForPowerOfTwoPlayers, createMatchs}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class TournamentTest extends AnyWordSpec with Matchers {
  "a Tournament" when {
    "computeNumberOfMatch" should {
      "return 7 matches for 8 players" in {
        computeNumberOfMatchForPowerOfTwoPlayers(8) shouldEqual Some(7)
      }
      "return None for 6 players" in {
        computeNumberOfMatchForPowerOfTwoPlayers(6) shouldEqual None
      }
      "return None for 9 players" in {
        computeNumberOfMatchForPowerOfTwoPlayers(9) shouldEqual None
      }
    }

    "create binary tree" in {
      createMatchs(1)(0) shouldEqual Node(WaitingMatch, Leaf(WaitingMatch), Leaf(WaitingMatch))
    }
  }
}
