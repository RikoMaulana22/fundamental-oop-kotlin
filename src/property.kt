class Rectangle(var width: Double, var height: Double) {
    var area: Double
        get() = width * height
        set(value) {
            height = value / width
        }
}

val rectangle = Rectangle(5.0, 10.0)
