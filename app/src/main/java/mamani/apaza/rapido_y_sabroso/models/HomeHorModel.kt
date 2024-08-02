package mamani.apaza.rapido_y_sabroso.models

data class HomeHorModel(
    var image: Int,
    var name: String
) {
    // Método adicional si es necesario
    fun displayInfo() {
        println("Image: $image, Name: $name")
    }
}
