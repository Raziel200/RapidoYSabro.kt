package mamani.apaza.rapido_y_sabroso.models

import com.google.android.material.animation.MotionTiming

data class HomeVerModel(
    var image: Int,
    var name: String,
    var timing: String,
    var rating: String,
    var price: String
) {
    //esto es adicional displayInfo que muestra la información del objeto
    // Método adicional si es necesario
    fun displayInfo() {
        println("Image: $image, Name: $name, Timing: $timing, Rating: $rating, Price: $price")
    }
}
