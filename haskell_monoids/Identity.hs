module Identity (
    RightIdentity(..)
  , LeftIdentity(..)
  , Identity(..)
) where

import Magma

class Magma a => RightIdentity a where
  rightEmpty :: a

class Magma a => LeftIdentity a where
  leftEmpty :: a

class (LeftIdentity a, RightIdentity a) => Identity a where
  empty :: a

instance Num a => RightIdentity (Sum a) where
  rightEmpty = Sum 0

instance Num a => LeftIdentity (Sum a) where
  leftEmpty = Sum 0

instance Num a => Identity (Sum a) where
  empty = Sum 0
