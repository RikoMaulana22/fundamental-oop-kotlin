fun main() {
   // Integer Types
   val byteValue: Byte = 127
   val shortValue: Short = 32767
   val intValue: Int = 2147483647
   val longValue: Long = 9223372036854775807

   // Floating Point Types
   val floatValue: Float = 3.14F
   val doubleValue: Double = 3.141592653589793

   // Char and String
   val charValue: Char = 'A'
   val stringValue: String = "Hello, Kotlin!"

   // Boolean
   val booleanValue: Boolean = true

   // Array
   val intArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)

   println("Byte Value: $byteValue")
   println("Short Value: $shortValue")
   println("Int Value: $intValue")
   println("Long Value: $longValue")
   println("Float Value: $floatValue")
   println("Double Value: $doubleValue")
   println("Char Value: $charValue")
   println("String Value: $stringValue")
   println("Boolean Value: $booleanValue")
   println("Array Value: ${intArray.joinToString()}")
}