package es.unex.giiis.intentslab

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSaludar = findViewById<Button>(R.id.bSaludar)
        bSaludar.setOnClickListener { view ->
            Snackbar.make(view, "Remplaza con una acción", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}
