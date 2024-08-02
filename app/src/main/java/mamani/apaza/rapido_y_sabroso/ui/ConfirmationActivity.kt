package mamani.apaza.rapido_y_sabroso.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import mamani.apaza.rapido_y_sabroso.R

class ConfirmationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_confirmation)

        // Configurar el clic en el botón "Aceptar"
        val buttonOk: TextView = findViewById(R.id.buttonOk)
        buttonOk.setOnClickListener {
            finish() // Cierra la actividad actual
        }
    }
}
