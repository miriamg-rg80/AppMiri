package mx.edu.utng.appmenu

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        btnViaje.setOnClickListener{
            startActivity(Intent(this, ViajeActivity::class.java))
        }
        btnCalculadoraPrestamo.setOnClickListener{
            startActivity(Intent(this, PrestamoActivity::class.java))
        }
        btnJuego.setOnClickListener{
            startActivity(Intent(this, GatoActivity::class.java))
        }
        btnSalir.setOnClickListener{
            System.exit(0)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Se crea objeto para cargar menu
        val inflater: MenuInflater = menuInflater
        //XML donde se definio el menu
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var mensaje: String=""
        when(item.itemId){
            R.id.itmViaje -> {
                mensaje="Ha seleccionado la calculadora de viaje"
                startActivity(Intent(this, ViajeActivity::class.java))
            }
            R.id.itmPrestamo ->{ mensaje="Se ha seleccionado PRESTAMO"
                startActivity(Intent(this, PrestamoActivity::class.java))
            }
            R.id.itmJuego    -> {mensaje="Se ha seleccionado JUEGO"
                startActivity(Intent(this, GatoActivity::class.java))
            }
            R.id.itmSali->{
                mensaje="Se ha seleccionado SALIR"
                System.exit(0)
            }
        }
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}
