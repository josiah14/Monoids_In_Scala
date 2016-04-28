package com.abstract_algebra

case class SumSemigroup[A: Numeric]() extends Semigroup[A] {
  def concat(a: A, b: A): A = implicitly[Numeric[A]].plus(a, b)
}
