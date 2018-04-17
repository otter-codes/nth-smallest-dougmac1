import org.scalatest._

class SecondLargestNumberSpec extends WordSpec with MustMatchers {

  "SecondLargestNumber" must {

    "return 4 when given a list of 1,2,3,4,5 and an 'n' of 2" in {
      SecondLargestNumber.finder(List(1,2,3,4,5), 2) mustEqual 4
    }
  }

}
