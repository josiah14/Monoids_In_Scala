module Semigroup (
  Semigroup(..)
) where

import Magma

class Magma a => Semigroup a

instance Num a => Semigroup (Sum a)
