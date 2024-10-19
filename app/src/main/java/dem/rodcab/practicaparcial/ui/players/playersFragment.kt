package dem.rodcab.practicaparcial.ui.players

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dem.rodcab.practicaparcial.R
import dem.rodcab.practicaparcial.ui.adapter.PlayerAdapter
import dem.rodcab.practicaparcial.ui.model.PlayerModel


class playersFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_players, container, false)
        val rvPlayers = view.findViewById<RecyclerView>(R.id.rvPlayers)
        rvPlayers.layoutManager = LinearLayoutManager(requireContext())
        rvPlayers.adapter = PlayerAdapter(getPlayers())
        return view
    }

    private fun getPlayers(): List<PlayerModel> {
        val lstPlayers : ArrayList<PlayerModel> = ArrayList()
        lstPlayers.add(PlayerModel(1, R.drawable.messi, 1987, "Lionel Messi", 34))
        lstPlayers.add(PlayerModel(2, R.drawable.neymar, 1992, "Neymar", 30))
        lstPlayers.add(PlayerModel(3, R.drawable.cr7, 1987, "Cristiano Ronaldo", 34))
        return lstPlayers

    }


}