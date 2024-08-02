package mamani.apaza.rapido_y_sabroso.adapters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.models.DetailedComidaModel

class DetailedComidaAdapter(private val list: List<DetailedComidaModel>) : RecyclerView.Adapter<DetailedComidaAdapter.ViewHolder>() {

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.detailed_comida_diaria_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.imageView.setImageResource(item.image)
        holder.name.text = item.name
        holder.price.text = item.price
        holder.description.text = item.description
        holder.timing.text = item.timing
        holder.rating.text = item.rating
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.detailed_img)
        val name: TextView = itemView.findViewById(R.id.detailed_name)
        val price: TextView = itemView.findViewById(R.id.detailed_price)
        val description: TextView = itemView.findViewById(R.id.detailed_des)
        val rating: TextView = itemView.findViewById(R.id.detailed_rating)
        val timing: TextView = itemView.findViewById(R.id.detailed_timing)
    }
}



