fun main(args: Array<String>) {
   //create a toyota object, corolla
    val corolla:Toyota = Toyota()

    //give properties to toyota object
    corolla.engineSize = 1800
    corolla.wheels = 4
    corolla.color = "Blue"
    corolla.trailerCount = 2

    //retrieve property from corolla
    println("Corolla Engine: ${corolla.engineSize}")

    println(corolla.movement("Left"))

    //call function using named parameter
    corolla.service(ticket = 4,duration = 20.5,
        name = "Corolla")

    //create mitsubishi object
    val canter:Mitsubishi = Mitsubishi()
    println(canter.movement(direction = "Front"))

    //basic example of polymorphism
    val myMitsu:Car = Mitsubishi()

}