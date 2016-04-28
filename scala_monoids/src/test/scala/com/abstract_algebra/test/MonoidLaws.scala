package com.abstract_algebra.test

import com.abstract_algebra.Sum

import org.scalacheck.{Arbitrary, Prop}

import IdentityLaws._
import SemigroupLaws._

object MonoidLaws {
  def monoidProp[A: Numeric: Arbitrary]: Prop = identityProp[A] ==> associative[A]
}
