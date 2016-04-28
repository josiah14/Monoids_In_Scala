package com.abstract_algebra

trait Magma[A] {
  def concat(a: A, b: A): A
}
