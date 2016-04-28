import com.abstract_algebra.Sum

import org.scalatest._
import org.scalatest.prop.Checkers._

import com.abstract_algebra.test.MonoidLaws._

class MonoidSpec extends FunSpec with Matchers {
  describe("Monoid") {
    it("has associative binary concatination") {
      check(monoidProp[Int])
    }
  }
}
