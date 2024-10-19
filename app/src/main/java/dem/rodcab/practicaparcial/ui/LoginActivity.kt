package dem.rodcab.practicaparcial.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import dem.rodcab.practicaparcial.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        title = "Sign In"
        val emailSuccess: String = "rodrigo@esan.com"
        val passwordSuccess: String = "1234"

        val ptUser: EditText = findViewById(R.id.ptUser)
        val ptPassword: EditText = findViewById(R.id.ptPassword)
        val btnLogin: Button = findViewById(R.id.btLogin)

        btnLogin.setOnClickListener {
            val email: String = ptUser.text.toString()
            val password: String = ptPassword.text.toString()

            if(email == emailSuccess && password == passwordSuccess){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            val rootView: View = findViewById(android.R.id.content)
            Snackbar.make(rootView, "Credenciales incorrectas", Snackbar.LENGTH_SHORT).show()

        }

    }
}