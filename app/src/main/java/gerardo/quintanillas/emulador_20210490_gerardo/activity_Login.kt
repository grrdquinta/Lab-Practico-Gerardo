package gerardo.quintanillas.emulador_20210490_gerardo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent

class activity_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSignIn = findViewById<Button>(R.id.btnSignIn)
        val txtUserName = findViewById<EditText>(R.id.txtUserName)
        val txtPassword = findViewById<EditText>(R.id.txtPassword)

        btnSignIn.setOnClickListener {
            if(txtUserName.text.toString() == "Gerardo" && txtPassword.text.toString() == "12345" ){
                Toast.makeText(this, "Sesion Iniciada correctamente", Toast.LENGTH_LONG).show()
                val intenth = Intent(this, MainActivity::class.java)
                startActivity(intenth)
            }
            else{
                Toast.makeText(this, "Credenciales Invalidas", Toast.LENGTH_LONG).show()
            }
        }
    }
}