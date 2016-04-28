package com.abstract_algebra

case class SumIdentity[A: Numeric]() extends Identity[A] {
  def concat(a: A, b: A): A = implicitly[Numeric[A]].plus(a, b)
  val rightEmpty: A = implicitly[Numeric[A]].zero
  val leftEmpty: A = implicitly[Numeric[A]].zero
}
