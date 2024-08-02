package mamani.apaza.rapido_y_sabroso.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.models.HomeHorModel
import mamani.apaza.rapido_y_sabroso.models.HomeVerModel

class HomeHorAdapter(
    private val updateVerticalRec: UpdateVerticalRec,
    private val activity: Activity,
    private val list: ArrayList<HomeHorModel>
) : RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {

    private var check = true
    private var select = true
    private var row_index = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_horizontal_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name

        if (check) {
            val homeVerModels = arrayListOf(
                HomeVerModel(R.drawable.pizza1, "Pizza Margherita", "10:00 - 23:00", "4.9", "Min - $35"),
                HomeVerModel(R.drawable.pizza2, "Pizza Pepperoni", "10:00 - 23:00", "4.8", "Min - $37"),
                HomeVerModel(R.drawable.pizza3, "Pizza Veggie", "10:00 - 23:00", "4.7", "Min - $34"),
                HomeVerModel(R.drawable.pizza4, "Pizza Hawaiian", "10:00 - 23:00", "4.6", "Min - $36")
            )
            updateVerticalRec.callBack(position, homeVerModels)
            check = false
        }

        holder.cardView.setOnClickListener {
            row_index = position
            notifyDataSetChanged()

            val homeVerModels = when (position) {
                0 -> arrayListOf(
                    HomeVerModel(R.drawable.pizza1, "Pizza Margherita", "10:00 - 23:00", "4.9", "Min - $35"),
                    HomeVerModel(R.drawable.pizza2, "Pizza Pepperoni", "10:00 - 23:00", "4.8", "Min - $37"),
                    HomeVerModel(R.drawable.pizza3, "Pizza Veggie", "10:00 - 23:00", "4.7", "Min - $34"),
                    HomeVerModel(R.drawable.pizza4, "Pizza Hawaiian", "10:00 - 23:00", "4.6", "Min - $36")
                )
                1 -> arrayListOf(
                    HomeVerModel(R.drawable.burger1, "Burger Classic", "10:00 - 23:00", "4.9", "Min - $30"),
                    HomeVerModel(R.drawable.burger2, "Burger Cheese", "10:00 - 23:00", "4.8", "Min - $32"),
                    HomeVerModel(R.drawable.burger4, "Burger Veggie", "10:00 - 23:00", "4.7", "Min - $31")
                )
                2 -> arrayListOf(
                    HomeVerModel(R.drawable.fries1, "Fries Classic", "10:00 - 23:00", "4.9", "Min - $10"),
                    HomeVerModel(R.drawable.fries2, "Fries Cheese", "10:00 - 23:00", "4.8", "Min - $12"),
                    HomeVerModel(R.drawable.fries3, "Fries Curly", "10:00 - 23:00", "4.7", "Min - $11"),
                    HomeVerModel(R.drawable.fries4, "Fries Sweet Potato", "10:00 - 23:00", "4.6", "Min - $13")
                )
                3 -> arrayListOf(
                    HomeVerModel(R.drawable.icecream1, "Ice Cream Chocolate", "9:00 - 5:00", "4.9", "Min - $15"),
                    HomeVerModel(R.drawable.icecream2, "Ice Cream Vainilla", "9:00 - 5:00", "4.8", "Min - $16"),
                    HomeVerModel(R.drawable.icecream3, "Ice Cream Milk", "9:00 - 5:00", "4.7", "Min - $14"),
                    HomeVerModel(R.drawable.icecream4, "Ice Cream Strawberry", "9:00 - 5:00", "4.6", "Min - $15")
                )
                4 -> arrayListOf(
                    HomeVerModel(R.drawable.sandwich1, "Sandwich Club", "10:00 - 23:00", "4.9", "Min - $25"),
                    HomeVerModel(R.drawable.sandwich2, "Sandwich Ham", "10:00 - 23:00", "4.8", "Min - $26"),
                    HomeVerModel(R.drawable.sandwich3, "Sandwich Veggie", "10:00 - 23:00", "4.7", "Min - $24"),
                    HomeVerModel(R.drawable.sandwich4, "Sandwich Turkey", "10:00 - 23:00", "4.6", "Min - $27")
                )
                else -> arrayListOf()
            }

            updateVerticalRec.callBack(position, homeVerModels)
        }

        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg)
                select = false
            }
        } else {
            holder.cardView.setBackgroundResource(if (row_index == position) R.drawable.change_bg else R.drawable.default_bg)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.hor_img)
        val name: TextView = itemView.findViewById(R.id.hor_text)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }
}






