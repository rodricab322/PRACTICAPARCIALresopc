package dem.rodcab.practicaparcial.ui.equipos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import dem.rodcab.practicaparcial.R

class   equiposFragment : Fragment() {

    var arrTeam = arrayOf(
        "Machester City", "Barcelona", "Real Madrid", "Liverpool", "Bayern Munchen","Manchester United","PSG","Tottenham"
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_equipos, container, false)
        val lstEquipos: ListView = view.findViewById(R.id.lstEquipos)
        val adaptor = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_list_item_1,
            arrTeam
        )
        lstEquipos.adapter = adaptor
        return view
    }

}