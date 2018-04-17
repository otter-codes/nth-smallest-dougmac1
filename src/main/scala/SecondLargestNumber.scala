object SecondLargestNumber {

  def finder(register : List[Int], n : Int) : Int  = {
    val register = List(1,2,3,4,5)

val register2 = register.distinct.sorted
  register2(register2.length-n)


  }
}
