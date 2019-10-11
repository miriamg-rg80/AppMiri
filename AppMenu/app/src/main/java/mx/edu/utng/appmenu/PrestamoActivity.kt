package mx.edu.utng.appmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_prestamo.*
import kotlinx.android.synthetic.main.activity_prestamo.btnCalcular
import kotlinx.android.synthetic.main.activity_prestamo.btnRegresar
import kotlinx.android.synthetic.main.activity_prestamo.txvResultado

class PrestamoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prestamo)
        btnRegresar.setOnClickListener {
            finish()
        }
        var mensaje: String =""
        var mensaje2: String ="Se realizaron los cálculos"


        btnCalcular.setOnClickListener(){
            if (rdb6meses.isChecked){
                var monto: Double = etxMonto.text.toString().toDouble()
                var interesAnual: Double = etxInteresAnual.text.toString().toDouble()

                var interes = interesAnual/100
                var i = interes/12

                var arriba = Math.pow((1+i),6.0) * i
                var abajo = Math.pow((1+i),6.0) - 1
                var pagosMensuales = monto*(arriba/abajo)
                var totalPagar = pagosMensuales*6
                var totalInteres =totalPagar-monto

                Toast.makeText(this, mensaje2, Toast.LENGTH_LONG).show()
                txvResultado.text="Monto Solicitado: $${monto.toString()}\n" +
                        "Pagos mensuales: $${pagosMensuales.toString()} \n" +
                        "Interés a pagar: $${totalInteres.toString()}+\n" +
                        "Total a pagar: $${totalPagar.toString()} "
            }else if (rdb12meses.isChecked){

                var monto: Double = etxMonto.text.toString().toDouble()
                var interesAnual: Double = etxInteresAnual.text.toString().toDouble()

                var interes = interesAnual/100
                var i = interes/12

                var arriba = Math.pow((1+i),12.0) * i
                var abajo = Math.pow((1+i),12.0) - 1
                var pagosMensuales = monto*(arriba/abajo)
                var totalPagar = pagosMensuales*12
                var totalInteres =totalPagar-monto
                Toast.makeText(this, mensaje2, Toast.LENGTH_LONG).show()
                txvResultado.text="Monto Solicitado: $${monto.toString()}\n" +
                        "Pagos mensuales: $${pagosMensuales.toString()} \n" +
                        "Interés a pagar: $${totalInteres.toString()}+\n" +
                        "Total a pagar: $${totalPagar.toString()} "


            }else if (rdb18meses.isChecked){

                var monto: Double = etxMonto.text.toString().toDouble()
                var interesAnual: Double = etxInteresAnual.text.toString().toDouble()

                var interes = interesAnual/100
                var i = interes/12

                var arriba = Math.pow((1+i),18.0) * i
                var abajo = Math.pow((1+i),18.0) - 1
                var pagosMensuales = monto*(arriba/abajo)
                var totalPagar = pagosMensuales*18
                var totalInteres =totalPagar-monto
                Toast.makeText(this, mensaje2, Toast.LENGTH_LONG).show()
                txvResultado.text="Monto Solicitado: $${monto.toString()}\n" +
                        "Pagos mensuales: $${pagosMensuales.toString()} \n" +
                        "Interés a pagar: $${totalInteres.toString()}+\n" +
                        "Total a pagar: $${totalPagar.toString()} "



            }else if (rdb24meses.isChecked){

                var monto: Double = etxMonto.text.toString().toDouble()
                var interesAnual: Double = etxInteresAnual.text.toString().toDouble()

                var interes = interesAnual/100
                var i = interes/12

                var arriba = Math.pow((1+i),24.0) * i
                var abajo = Math.pow((1+i),24.0) - 1
                var pagosMensuales = monto*(arriba/abajo)
                var totalPagar = pagosMensuales*24
                var totalInteres =totalPagar-monto
                Toast.makeText(this, mensaje2, Toast.LENGTH_LONG).show()
                txvResultado.text="Monto Solicitado: $${monto.toString()}\n" +
                        "Pagos mensuales: $${pagosMensuales.toString()} \n" +
                        "Interés a pagar: $${totalInteres.toString()}+\n" +
                        "Total a pagar: $${totalPagar.toString()} "

            }
            else {
                mensaje = "No se realizo ningun cálulo"
            }
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        }
    }
}
