package com.abstract_algebra.test

import com.abstract_algebra.SumIdentity

import org.scalacheck.{Arbitrary, Prop}

object IdentityLaws {
  def rightIdentity[A: Numeric: Arbitrary]: Prop = Prop.forAll { (x: A) =>
    val rightId = SumIdentity[A]
    import rightId.{rightEmpty, concat}

    concat(x, rightEmpty) == x
  }

  def leftIdentity[A: Numeric: Arbitrary]: Prop = Prop.forAll { (x: A) =>
    val leftId = SumIdentity[A]
    import leftId.{leftEmpty, concat}

    concat(leftEmpty, x) == x
  }

  def identityProp[A: Numeric: Arbitrary]: Prop = leftIdentity[A] ==> rightIdentity[A] ==> Prop.forAll { (x: A) =>
    val Id = SumIdentity[A]
    import Id.{empty, concat}

    concat(x, empty) == x && concat(empty, x) == x
  }
}
