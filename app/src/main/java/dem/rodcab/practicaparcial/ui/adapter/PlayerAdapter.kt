package dem.rodcab.practicaparcial.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dem.rodcab.practicaparcial.R
import dem.rodcab.practicaparcial.ui.model.PlayerModel

class PlayerAdapter (private var lstPlayer: List<PlayerModel>):
        RecyclerView.Adapter<PlayerAdapter.ViewHolder>()
        {
                class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
                        val tvName: TextView = itemView.findViewById(R.id.tvName)
                        val tvAnio: TextView = itemView.findViewById(R.id.tvAnio)
                        val tvEdad: TextView = itemView.findViewById(R.id.tvEdad)
                        val ivPlayer: ImageView = itemView.findViewById(R.id.ivPlayer)

                }

                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                        val layoutInflater = LayoutInflater.from(parent.context)
                        return ViewHolder(layoutInflater.inflate(R.layout.item_player, parent, false))
                }

                override fun getItemCount(): Int {
                        return lstPlayer.size
                }

                override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                        val itemPlayer = lstPlayer[position]
                        holder.ivPlayer.setImageResource(itemPlayer.image)
                        holder.tvName.text = itemPlayer.name
                        holder.tvAnio.text = itemPlayer.year.toString()
                        holder.tvEdad.text = itemPlayer.age.toString()
                }

        }