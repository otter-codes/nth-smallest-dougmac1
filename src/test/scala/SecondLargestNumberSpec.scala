import org.scalatest._

class SecondLargestNumberSpec extends WordSpec with MustMatchers {

  "SecondLargestNumber" must {

    "return 1 when given a list of 1 and a 'n' of 1" in {
      SecondLargestNumber.finder(List(1), 1) mustEqual 1
    }

    "return 2 when given a list of 1,2,3 and a 'n' of 2" in {
      SecondLargestNumber.finder(List(1,2,3), 2) mustEqual 2
    }

    "return 4 when given a list of 1,2,3,4,5 and an 'n' of 2" in {
      SecondLargestNumber.finder(List(1,2,3,4,5), 2) mustEqual 4
    }
  }

}
