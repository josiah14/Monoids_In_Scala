module Magma (
    Magma(..)
  , Sum(..)
) where

-- First, declare what a Magma is
class Magma a where
  (<>) :: a -> a -> a

-- Now, make the Sum type, and have it be 'Show'able and 'Eq'uatable.
newtype Sum a = Sum a deriving (Show, Eq)

-- Then, declare that Sum is a Num so that we can use the + op on it generically.
instance Num a => Num (Sum a) where
  (+) (Sum x) (Sum y) = Sum (x + y)
  fromInteger = Sum . fromInteger

-- Now, declare that Sum is a Magma
instance Num a => Magma (Sum a) where
  (<>) = (+)
