class Toyota() : Car() {
    //initializer block for primary constructor
    init {
        //use super keyword to access parent properties
        val myWheels = super.wheels
        println("Number of Wheels: $myWheels")
    }

}