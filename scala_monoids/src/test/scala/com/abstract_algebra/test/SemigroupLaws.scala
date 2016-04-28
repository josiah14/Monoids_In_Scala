package com.abstract_algebra.test

import com.abstract_algebra.SumSemigroup

import org.scalacheck.{Arbitrary, Prop}

object SemigroupLaws {
  def associative[A: Numeric: Arbitrary]: Prop = Prop.forAll { (x: A, y: A, z: A) =>
    val semigroup = SumSemigroup[A]
    import semigroup._

    concat(x, concat(y, z)) == concat(concat(x, y), z)
  }
}
