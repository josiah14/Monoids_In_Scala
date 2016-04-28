package com.abstract_algebra

case class SumRightIdentity[A: Numeric]() extends RightIdentity[A] {
  def concat(a: A, b: A): A = implicitly[Numeric[A]].plus(a, b)
  val rightEmpty: A = implicitly[Numeric[A]].zero
}
