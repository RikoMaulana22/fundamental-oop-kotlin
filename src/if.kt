fun main() {
   val examScore = 90

   val result = if (examScore == 100) {
      "Great Score!"
   } else if (examScore >= 80) {
      "Good Effort!"
   } else {
      "Nice try!"
   }

   println(result)
}