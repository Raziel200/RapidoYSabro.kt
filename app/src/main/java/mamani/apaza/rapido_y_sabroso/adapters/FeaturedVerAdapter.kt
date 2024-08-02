package mamani.apaza.rapido_y_sabroso.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.models.FeaturedVerModel

class FeaturedVerAdapter(private val list: List<FeaturedVerModel>) :
    RecyclerView.Adapter<FeaturedVerAdapter.ViewHolder>() {

    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.featured_ver_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(@NonNull holder: ViewHolder, position: Int) {
        val model = list[position]
        holder.imageView.setImageResource(model.image)
        holder.name.text = model.name
        holder.description.text = model.description
        holder.timing.text = model.timing
        holder.rating.text = model.rating
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.detailed_img)
        val name: TextView = itemView.findViewById(R.id.detailed_name)
        val description: TextView = itemView.findViewById(R.id.detailed_des)
        val rating: TextView = itemView.findViewById(R.id.detailed_rating)
        val timing: TextView = itemView.findViewById(R.id.detailed_timing)
    }
}






