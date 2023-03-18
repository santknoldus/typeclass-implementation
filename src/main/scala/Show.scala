package com.knoldus.typeclassimplementation

trait Show[A] {
  def show(a: A): String
}

case class Position(xPosition: Int, yPosition: Int)

object Show {
  //show implementation for long type
  val longShow: Show[Long] =
    new Show[Long] {
      def show(long: Long): String = long.toString
    }

  //show implementation for double type
  val doubleShow: Show[Double] =
    new Show[Double] {
      override def show(double: Double): String = double.toString
    }

  //show implementation for Position class type
  val positionShow: Show[Position] =
    new Show[Position] {
      override def show(position: Position): String = s"Pos(x: ${position.xPosition}, y: ${position.yPosition})"
    }
}
