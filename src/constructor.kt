class Book(val title: String, val author: String) {
    constructor(title: String) : this(title, "Unknown")
}

val book1 = Book("Kotlin Programming")
val book2 = Book("Learning Kotlin", "John Doe")