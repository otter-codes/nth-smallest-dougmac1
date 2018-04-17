object SecondLargestNumber {

  def finder(register: List[Int], n: Int): Int = {

    val singleNumbers = register.distinct.sorted

    if (n <= singleNumbers.length && n > 0) {

      singleNumbers(singleNumbers.length - n)

    } else {

      throw new NumberFormatException
    }
  }
}


