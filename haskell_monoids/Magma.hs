module Magma (
    Magma(..)
  , Sum(..)
) where

class Magma a where
  (<>) :: a -> a -> a

newtype Sum a = Sum a deriving (Show, Eq)

instance Num a => Num (Sum a) where
  (+) (Sum x) (Sum y) = Sum (x + y)
  fromInteger = Sum . fromInteger

instance Num a => Magma (Sum a) where
  (<>) = (+)
