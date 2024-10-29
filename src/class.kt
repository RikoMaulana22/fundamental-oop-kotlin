class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

val person = Person("Alice", 30)
