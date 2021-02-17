open class Car (){
    //car properties
    open var engineSize:Int = 0
    open var color:String = ""
    open var wheels:Int = 0
    var trailerCount:Int = 0

    //secondary constructor for model name
    constructor(model:String) : this(){
        println("Model is $model")
    }

    //function called movement
   open fun movement(direction:String) : String{
        return "Car moving in $direction direction"
    }

    //function called isAbleToFly
    fun isAbleToFly():Boolean{
        return false
    }

    //function called service
    fun service(name:String, duration:Double,
                ticket:Int, date:String = "Today")
    {
        println("Service complete")
    }

}