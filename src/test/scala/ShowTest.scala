package com.knoldus.typeclassimplementation

import org.scalatest.funsuite.AnyFunSuite

class ShowTest extends AnyFunSuite {
  test("longShow") {
    val long: Long = 37468
    val show = Show.longShow.show(long)
    assert(show === long.toString)
  }
  test("doubleShow") {
    val double: Double = 456.98
    val show = Show.doubleShow.show(double)
    assert(show === double.toString)
  }
  test("Position.show") {
    val position = Position(0, 1)
    val show = Show.positionShow.show(position)
    val expectedOutput = "Pos(x: 0, y: 1)"
    assert(show === expectedOutput)
  }
}
