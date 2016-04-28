module Monoid (

) where

import Magma(Sum)
import Semigroup
import Identity

class (Identity a, Semigroup a) => Monoid a

instance Num a => Monoid (Sum a)
