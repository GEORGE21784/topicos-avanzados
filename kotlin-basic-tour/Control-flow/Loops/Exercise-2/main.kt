fun main() {
   /* print numbers from 1 to 100, but for multiples of 3 print "fizz", 
      for multiples of 5 print "buzz", and for multiples of both 3 and 5 print "fizzbuzz"
   */
   for(num in 1..100) {
      var ans = ""
      if(num % 3 == 0) ans += "fizz"
      if(num % 5 == 0) ans += "buzz"
      if(ans.length == 0) ans += num.toString()
      println(ans)
   }
}