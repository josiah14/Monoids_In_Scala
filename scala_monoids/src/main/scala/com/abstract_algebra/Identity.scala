package com.abstract_algebra

trait Identity[A] extends RightIdentity[A] with LeftIdentity[A] {
  val empty: A = concat(rightEmpty, leftEmpty)
}
