package com.abstract_algebra

case class SumMagma[A: Numeric]() extends Magma[A] {
  def concat(a: A, b: A): A = implicitly[Numeric[A]].plus(a, b)
}
