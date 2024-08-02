package mamani.apaza.rapido_y_sabroso.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import mamani.apaza.rapido_y_sabroso.R

class iniciar_secion : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iniciar_secion)

        // Referencias a los elementos de la UI
        val etUsuario: EditText = findViewById(R.id.editText5)
        val etPassword: EditText = findViewById(R.id.editText6)
        val iniciarSesionBtn: TextView = findViewById(R.id.inscribirse)

        // Configuración del tipo de entrada para la contraseña
        etPassword.inputType = EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_VARIATION_PASSWORD

        // Configuración del listener para el botón "Iniciar Sesión"
        iniciarSesionBtn.setOnClickListener {
            // Obtención de los valores introducidos por el usuario
            val usuario = etUsuario.text.toString().trim()
            val password = etPassword.text.toString().trim()

            // Verificación de los datos
            if (usuario == "razielmamani9@gmail.com" && password == "123456") {
                // Si los datos son correctos, redirige a la actividad Menu_principal
                val intent = Intent(this, Menu_principal::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show()
            }
        }

        // Configuración del listener para el botón "Registrar"
        val registrarBtn: TextView = findViewById(R.id.registrar)
        registrarBtn.setOnClickListener {
            val intent = Intent(this, Registrar_usuario::class.java)
            startActivity(intent)
        }

        // Configuración del listener para manejar la acción "Done" en el campo de la contraseña
        etPassword.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                iniciarSesionBtn.performClick()
                true
            } else {
                false
            }
        }
    }
}
