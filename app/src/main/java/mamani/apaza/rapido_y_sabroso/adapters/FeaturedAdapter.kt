package mamani.apaza.rapido_y_sabroso.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.models.FeaturedModel

class FeaturedAdapter(private val list: List<FeaturedModel>) :
    RecyclerView.Adapter<FeaturedAdapter.ViewHolder>() {

    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.featured_hor_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(@NonNull holder: ViewHolder, position: Int) {
        val model = list[position]
        holder.image.setImageResource(model.image)
        holder.name.text = model.name
        holder.desc.text = model.desc
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.featured_img)
        val name: TextView = itemView.findViewById(R.id.featured_name)
        val desc: TextView = itemView.findViewById(R.id.featured_des)
    }
}

