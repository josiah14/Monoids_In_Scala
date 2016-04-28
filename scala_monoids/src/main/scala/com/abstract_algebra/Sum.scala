package com.abstract_algebra

case class Sum[A: Numeric]() extends Monoid[A] {
  def concat(a: A, b: A): A = implicitly[Numeric[A]].plus(a, b)
  val leftEmpty: A = implicitly[Numeric[A]].zero
  val rightEmpty: A = leftEmpty
}
