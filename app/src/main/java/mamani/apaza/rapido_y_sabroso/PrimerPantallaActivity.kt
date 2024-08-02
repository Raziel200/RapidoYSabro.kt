
package mamani.apaza.rapido_y_sabroso

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import mamani.apaza.rapido_y_sabroso.activities.Registrar_usuario
import mamani.apaza.rapido_y_sabroso.activities.iniciar_secion

class PrimerPantallaActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_inicio)

        val inscribirseBtn: TextView = findViewById(R.id.inscribirseBtn)
        inscribirseBtn.setOnClickListener {
            val intent = Intent(this, Registrar_usuario::class.java)
            startActivity(intent)
        }
        val iniciarSecionBtn: TextView = findViewById(R.id.accesoBtn)
        iniciarSecionBtn.setOnClickListener {
            val intent = Intent(this, iniciar_secion::class.java)
            startActivity(intent)
        }

    }
}
