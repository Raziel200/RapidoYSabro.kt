package mamani.apaza.rapido_y_sabroso.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.models.HomeVerModel

class HomeVerAdapter(
    private val context: Context,
    private val list: ArrayList<HomeVerModel>
) : RecyclerView.Adapter<HomeVerAdapter.ViewHolder>() {

    private var bottomSheetDialog: BottomSheetDialog? = null

    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_vertical_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(@NonNull holder: ViewHolder, position: Int) {
        val item = list[position]
        val mName = item.name
        val mTiming = item.timing
        val mRating = item.rating
        val mPrice = item.price
        val mImage = item.image

        holder.imageView.setImageResource(mImage)
        holder.name.text = mName
        holder.timing.text = mTiming
        holder.rating.text = mRating
        holder.price.text = mPrice

        holder.itemView.setOnClickListener {
            bottomSheetDialog = BottomSheetDialog(context, R.style.BottomSheetTheme)
            val sheetView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout, null)

            sheetView.findViewById<View>(R.id.add_to_cart).setOnClickListener {
                Toast.makeText(context, "Añadido al Carrito", Toast.LENGTH_SHORT).show()
                bottomSheetDialog?.dismiss()
            }

            val bottomImg: ImageView = sheetView.findViewById(R.id.bottom_img)
            val bottomName: TextView = sheetView.findViewById(R.id.bottom_name)
            val bottomPrice: TextView = sheetView.findViewById(R.id.bottom_price)
            val bottomRating: TextView = sheetView.findViewById(R.id.bottom_rating)

            bottomName.text = mName
            bottomPrice.text = mPrice
            bottomRating.text = mRating
            bottomImg.setImageResource(mImage)

            bottomSheetDialog?.setContentView(sheetView)
            bottomSheetDialog?.show()
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ver_img)
        val name: TextView = itemView.findViewById(R.id.name)
        val timing: TextView = itemView.findViewById(R.id.timing)
        val rating: TextView = itemView.findViewById(R.id.rating)
        val price: TextView = itemView.findViewById(R.id.price)
    }
}






