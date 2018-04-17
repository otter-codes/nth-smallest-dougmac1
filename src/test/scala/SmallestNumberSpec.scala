import org.scalatest._

class SmallestNumberSpec extends WordSpec with MustMatchers {

  "SmallestNumber" must {

    "return number 4 when given a list of 1, 2, 3, 4, 5" in {
      SmallestNumber.finder(List(1,2,3,4,5), n = 4) mustEqual 4
    }

  }

}
