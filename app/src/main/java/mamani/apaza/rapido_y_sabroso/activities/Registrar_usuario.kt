package mamani.apaza.rapido_y_sabroso.activities

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import mamani.apaza.rapido_y_sabroso.R

class Registrar_usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrar_usuario)

        // Referencias a los elementos de la UI
        val etNombre: EditText = findViewById(R.id.editText4)
        val etUsuario: EditText = findViewById(R.id.editText5)
        val etPassword: EditText = findViewById(R.id.editText6)
        val inscribirseBtn: TextView = findViewById(R.id.inscribirse)
        val yaIniciaSesionBtn: TextView = findViewById(R.id.ya_inicia_sesion)

        // Configuración del tipo de entrada para la contraseña
        etPassword.inputType = EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_VARIATION_PASSWORD

        // Configuración del listener para el botón "Inscribirse"
        inscribirseBtn.setOnClickListener {
            // Obtención de los valores introducidos por el usuario
            val nombre = etNombre.text.toString().trim()
            val usuario = etUsuario.text.toString().trim()
            val password = etPassword.text.toString().trim()

            // Verificación de los datos
            if (nombre == "jhony" && usuario == "razielmamani9@gmail.com" && password == "123456") {
                // Si los datos son correctos, redirige a la actividad Menu_principal
                val intent = Intent(this, Menu_principal::class.java)
                startActivity(intent)
            } else {
                // Si los datos son incorrectos, muestra un mensaje de error
                Toast.makeText(this, "Nombre de usuario o contraseña incorrecta", Toast.LENGTH_LONG).show()
            }
        }

        // Configuración del listener para manejar la acción "Done" en el campo de la contraseña
        etPassword.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                inscribirseBtn.performClick()
                true
            } else {
                false
            }
        }

        // Configuración del listener para manejar la acción "Next" en los otros campos de texto
        etNombre.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_NEXT) {
                etUsuario.requestFocus()
                true
            } else {
                false
            }
        }

        etUsuario.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_NEXT) {
                etPassword.requestFocus()
                true
            } else {
                false
            }
        }

        // Configuración del listener para el botón "Iniciar Sesión"
        yaIniciaSesionBtn.setOnClickListener {
            val intent = Intent(this, iniciar_secion::class.java)
            startActivity(intent)
        }
    }
}


