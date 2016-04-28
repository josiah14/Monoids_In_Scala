import com.abstract_algebra.SumIdentity

import org.scalatest._
import org.scalatest.prop.Checkers._

import com.abstract_algebra.test.IdentityLaws._

class IdentitySpec extends FunSpec with Matchers {
  describe("RightIdentity") {
    it("forms the identity function when the rightEmpty element is applied to the right side of the binary magma operation") {
      check(rightIdentity[Int])
    }
  }

  describe("LeftIdentity") {
    it("forms the identity function when the leftEmpty element is applied to the left side of the binary magma operation") {
      check(leftIdentity[Int])
    }
  }

  describe("Identity") {
    it("forms the identity function when the empty element is applied to either side of the binary magma operation") {
      check(identityProp[Int])
    }
  }
}
