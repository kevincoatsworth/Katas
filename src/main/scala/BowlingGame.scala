object BowlingGame {

  def startGame(score: String*) : String = {

    val x = score.toList

    x match {
      case x if x.toString == "X" => "10"
    }
    s"$x"
  }
}