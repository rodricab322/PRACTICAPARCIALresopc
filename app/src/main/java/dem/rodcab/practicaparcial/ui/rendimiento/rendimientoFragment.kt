package dem.rodcab.practicaparcial.ui.rendimiento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import dem.rodcab.practicaparcial.R


class rendimientoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_rendimiento, container, false)
        val ptKilometros: EditText  = rootView.findViewById(R.id.ptKilometros)
        val ptMinutos: EditText = rootView.findViewById(R.id.ptMinutos)
        val btnCalcular: Button = rootView.findViewById(R.id.btnCalcular)
        val tvResult: TextView = rootView.findViewById(R.id.tvResult)


        btnCalcular.setOnClickListener {
            val kmStr = ptKilometros.text.toString()
            val minStr = ptMinutos.text.toString()

            if (kmStr.isNotEmpty() && minStr.isNotEmpty()) {
                val km = kmStr.toFloat()
                val min = minStr.toFloat()

                if (min>0){
                    val rendimiento = km/min
                    tvResult.text = String.format("%.2f", rendimiento)
                }else{
                    tvResult.text = "El tiempo no puede ser 0"
                }

            } else {
                tvResult.text = "Por favor, ingrese valores válidos"
            }
        }
        return rootView
    }
}

