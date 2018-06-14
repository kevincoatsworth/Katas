import org.scalatest.{MustMatchers, WordSpec}

class BowlingGameSpec extends WordSpec with MustMatchers {

  "Bowling" should {

    "return a score of 10 when a strike/X is scored" in {

      BowlingGame.startGame("X") mustEqual "You scored 10"
    }

    "return a score of  when a strike/X is scored" in {

      BowlingGame.startGame("X","X","X","X","X","X","X","X","X","X") mustEqual "You scored 300"
    }
  }
}