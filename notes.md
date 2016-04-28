# Monoids in Scala

## Uses

- Due to the associative property of monoids, this means that we can group our monoid concatinations in any way that we want, which allows us to (somewhat trivially) write load balancing algorithms to parallelize the work and latently return the results as they are ready.  The only thing that needs to be ensured is that the order of concatinations is preserved... That is, unless it is a commutative monoid.
- Having a common interface to monoids (and being able to retrospectively apply the monoid typeclass to anything that is a monoid) means that we can define any new monoidic data structure and then just plug it into data processing frameworks like Algebird, Summingbird, Scalding, Spire, and potentially other monoid-aware frameworks.
- If it looks like a duck and quacks like a duck, it must be a duck.

## Monoids that exist in Algebird
 
- Max
- Min
- HyperLogLog
- Bloom Filter
- QTree
- Count Min Sketch
- Decayed Value (moving average)
- Sketch Map
- Addition and Multiplication of General Collections (Sets, Lists, Arrays, Maps, etc.)
