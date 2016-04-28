package com.abstract_algebra

case class SumLeftIdentity[A: Numeric]() extends LeftIdentity[A] {
  def concat(a: A, b: A): A = implicitly[Numeric[A]].plus(a, b)
  val leftEmpty: A = implicitly[Numeric[A]].zero
}
