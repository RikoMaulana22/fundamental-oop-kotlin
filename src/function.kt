fun sayHello(firstName: String, lastName: String = ""){
   println("Hello $firstName $lastName")
}

fun main() {
   sayHello("Riko")
   sayHello("Riko", "Maulana")
}