package mamani.apaza.rapido_y_sabroso.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.models.FeaturedModel
import mamani.apaza.rapido_y_sabroso.models.FeaturedVerModel
import mamani.apaza.rapido_y_sabroso.adapters.FeaturedAdapter
import mamani.apaza.rapido_y_sabroso.adapters.FeaturedVerAdapter

class SecondFragment : Fragment() {

    // Featured Hor RecyclerView
    private lateinit var featuredModelsList: MutableList<FeaturedModel>
    private lateinit var recyclerView: RecyclerView
    private lateinit var featuredAdapter: FeaturedAdapter

    // Featured Ver RecyclerView
    private lateinit var featuredVerModelList: MutableList<FeaturedVerModel>
    private lateinit var recyclerView2: RecyclerView
    private lateinit var featuredVerAdapter: FeaturedVerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        // Featured Hor RecyclerView
        recyclerView = view.findViewById(R.id.featured_hor_rec)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        featuredModelsList = mutableListOf()

        // Example data for horizontal RecyclerView
        featuredModelsList.add(FeaturedModel(R.drawable.rocoto_relleno, "Featured 1", "Description 1"))
        featuredModelsList.add(FeaturedModel(R.drawable.fav2, "Featured 2", "Description 2"))
        featuredModelsList.add(FeaturedModel(R.drawable.fav3, "Featured 3", "Description 3"))

        featuredAdapter = FeaturedAdapter(featuredModelsList)
        recyclerView.adapter = featuredAdapter

        // Featured Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec)
        recyclerView2.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        featuredVerModelList = mutableListOf()

        // Example data for vertical RecyclerView
        featuredVerModelList.add(FeaturedVerModel(R.drawable.rocoto_relleno, "Featured 1", "Descripcion 1", "4.8", "10:00 - 8:00"))
        featuredVerModelList.add(FeaturedVerModel(R.drawable.rocoto_relleno, "Featured 2", "Descripcion 2", "4.8", "10:00 - 8:00"))
        featuredVerModelList.add(FeaturedVerModel(R.drawable.ver3, "Featured 3", "Descripcion 3", "4.8", "10:00 - 8:00"))

        featuredVerModelList.add(FeaturedVerModel(R.drawable.ver1, "Featured 1", "Descripcion 1", "4.8", "10:00 - 8:00"))
        featuredVerModelList.add(FeaturedVerModel(R.drawable.rocoto_relleno, "Featured 2", "Descripcion 2", "4.8", "10:00 - 8:00"))
        featuredVerModelList.add(FeaturedVerModel(R.drawable.ver3, "Featured 3", "Descripcion 3", "4.8", "10:00 - 8:00"))

        featuredVerAdapter = FeaturedVerAdapter(featuredVerModelList)
        recyclerView2.adapter = featuredVerAdapter

        return view
    }
}
