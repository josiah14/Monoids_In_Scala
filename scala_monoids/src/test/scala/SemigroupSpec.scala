import com.abstract_algebra.SumSemigroup

import org.scalatest._
import org.scalatest.prop.Checkers._

import com.abstract_algebra.test.SemigroupLaws._

class SemigroupSpec extends FunSpec with Matchers {
  describe("Semigroup") {
    it("has associative binary concatination") {
      check(associative[Int])
    }
  }
}
