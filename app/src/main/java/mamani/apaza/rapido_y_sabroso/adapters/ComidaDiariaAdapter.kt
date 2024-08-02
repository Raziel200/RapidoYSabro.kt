
package mamani.apaza.rapido_y_sabroso.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.activities.DetailedDailyMealActivity
import mamani.apaza.rapido_y_sabroso.models.ComidaDiariaModel

class ComidaDiariaAdapter(private val context: Context, private val list: List<ComidaDiariaModel>) :
    RecyclerView.Adapter<ComidaDiariaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.comida_diaria_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.imageView.setImageResource(item.image)
        holder.name.text = item.name
        holder.discount.text = item.discount
        holder.description.text = item.description

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailedDailyMealActivity::class.java)
            intent.putExtra("type", item.type)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val name: TextView = itemView.findViewById(R.id.textView5)
        val description: TextView = itemView.findViewById(R.id.textView6)
        val discount: TextView = itemView.findViewById(R.id.discount)
    }
}



