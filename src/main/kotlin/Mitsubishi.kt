class Mitsubishi : Car(model = "Evolution") {

    override var wheels: Int
        get() = super.wheels
        set(value) {}

    override fun movement(direction: String): String {
        return "Movement from Mitsubishi"
    }

}