import org.scalatest._

class SecondLargestNumberSpec extends WordSpec with MustMatchers {

  "SecondLargestNumber" must {

    "return 4 when given a list of 1,2,3,4,5 and an 'n' of 2" in {
      SecondLargestNumber.finder(List(1,2,3,4,5), 2) mustEqual 4
    }

    "return 3 when given a list of 3,3,4,4,5,5 and an 'n' of 3" in {
      SecondLargestNumber.finder(List(3,3,4,4,5,5), 3) mustEqual 3

    }

    "return 10 when given a list of 3,4,5,6,7,8,9,10 and an 'n' of 1" in {
      SecondLargestNumber.finder(List(3,4,5,6,7,8,9,10), 1) mustEqual 10
    }

    "throw an error when given a list of 1,2 and an 'n' of 3" in {
      intercept[NumberFormatException] {
        SecondLargestNumber.finder(List(1, 2), 0) mustEqual new NumberFormatException
      }
    }
  }
}
