package mamani.apaza.rapido_y_sabroso.activities
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.adapters.DetailedComidaAdapter
import mamani.apaza.rapido_y_sabroso.models.DetailedComidaModel

class DetailedDailyMealActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var detailedComidaModelList: MutableList<DetailedComidaModel>
    private lateinit var comidaAdapter: DetailedComidaAdapter
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_daily_meal)

        val type = intent.getStringExtra("type")

        recyclerView = findViewById(R.id.detailed_rec)
        imageView = findViewById(R.id.detailed_img)

        recyclerView.layoutManager = LinearLayoutManager(this)
        detailedComidaModelList = mutableListOf()
        comidaAdapter = DetailedComidaAdapter(detailedComidaModelList)
        recyclerView.adapter = comidaAdapter

        if (type != null && type.equals("desayuno", ignoreCase = true)) {
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav1, "Desayuno", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav2, "Desayuno", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav3, "Desayuno", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav1, "Desayuno", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav2, "Desayuno", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav3, "Desayuno", "description", "4.4", "40", "10 to 9"))
            comidaAdapter.notifyDataSetChanged()
        }

        if (type != null && type.equals("almuerzo", ignoreCase = true)) {
            imageView.setImageResource(R.drawable.fav1)
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav1, "Almuerzo", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav2, "Almuerzo", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav3, "Almuerzo", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav1, "Almuerzo", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav2, "Almuerzo", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav3, "Almuerzo", "description", "4.4", "40", "10 to 9"))
            comidaAdapter.notifyDataSetChanged()
        }

        if (type != null && type.equals("cena", ignoreCase = true)) {
            imageView.setImageResource(R.drawable.fav3)
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav1, "Cena", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav2, "Cena", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav3, "Cena", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav1, "Cena", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav2, "Cena", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.fav3, "Cena", "description", "4.4", "40", "10 to 9"))
            comidaAdapter.notifyDataSetChanged()
        }

        if (type != null && type.equals("dulces", ignoreCase = true)) {
            imageView.setImageResource(R.drawable.sweets)
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.s1, "Dulce", "description", "4.4", "40", "10am to 9pm"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.s2, "Dulce", "description", "4.4", "40", "10am to 9pm"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.s4, "Dulce", "description", "4.4", "40", "10am to 9pm"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.s1, "Dulce", "description", "4.4", "40", "10am to 9pm"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.s2, "Dulce", "description", "4.4", "40", "10am to 9pm"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.s4, "Dulce", "description", "4.4", "40", "10am to 9pm"))
            comidaAdapter.notifyDataSetChanged()
        }

        if (type != null && type.equals("coffee", ignoreCase = true)) {
            imageView.setImageResource(R.drawable.coffe)
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.coffe, "Café1", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.coffe, "Café2", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.coffe, "Café3", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.coffe, "Café4", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.coffe, "Café5", "description", "4.4", "40", "10 to 9"))
            detailedComidaModelList.add(DetailedComidaModel(R.drawable.coffe, "Café6", "description", "4.4", "40", "10 to 9"))
            comidaAdapter.notifyDataSetChanged()
        }

    }
}




