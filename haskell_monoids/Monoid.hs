module Monoid (
    Magma(..)
  , Semigroup(..)
  , Identity(..)
  , Monoid(..)
  , Sum(..)
) where

import Prelude hiding (Monoid)
import Magma
import Semigroup
import Identity

class (Identity a, Semigroup a) => Monoid a

instance Num a => Monoid (Sum a)
