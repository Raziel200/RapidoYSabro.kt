
package mamani.apaza.rapido_y_sabroso.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.databinding.MicarritoItemBinding
import mamani.apaza.rapido_y_sabroso.models.CarroModel

class CarroAdapter(private var list: List<CarroModel>) : RecyclerView.Adapter<CarroAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MicarritoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val carroModel = list[position]
        holder.bind(carroModel)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateList(newList: List<CarroModel>) {
        Log.d("CarroAdapter", "Lista actualizada: $newList")
        list = newList
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: MicarritoItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(carroModel: CarroModel) {
            Log.d("CarroAdapter", "Enlazando producto: ${carroModel.name}")
            binding.detailedImg.setImageResource(carroModel.image)
            binding.detailedName.text = carroModel.name
            binding.detailedRating.text = carroModel.rating
            binding.textView7.text = carroModel.price
        }
    }
}


