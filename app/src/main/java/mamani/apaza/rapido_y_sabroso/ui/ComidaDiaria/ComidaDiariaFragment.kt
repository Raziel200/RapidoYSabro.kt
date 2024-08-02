
package mamani.apaza.rapido_y_sabroso.ui.ComidaDiaria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.adapters.ComidaDiariaAdapter
import mamani.apaza.rapido_y_sabroso.models.ComidaDiariaModel

class ComidaDiariaFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var comidaDiariaModels: MutableList<ComidaDiariaModel>
    private lateinit var comidaDiariaAdapter: ComidaDiariaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.comida_diaria_fragment, container, false)

        recyclerView = root.findViewById(R.id.comida_diaria_rec)
        recyclerView.layoutManager = LinearLayoutManager(context)

        comidaDiariaModels = mutableListOf(
            ComidaDiariaModel(R.drawable.breakfast, "Desayuno", "30% OFF", "Descripcion Descripcion", "desayuno"),
            ComidaDiariaModel(R.drawable.lunch, "Almuerzo", "20% OFF", "Descripcion Descripcion", "almuerzo"),
            ComidaDiariaModel(R.drawable.dinner, "Cena", "50% OFF", "Descripcion Descripcion", "cena"),
            ComidaDiariaModel(R.drawable.sweets, "Dulces", "39% OFF", "Descripcion Descripcion", "dulces"),
            ComidaDiariaModel(R.drawable.coffe, "Coffee", "20% OFF", "Descripcion Descripcion", "coffee")
        )

        comidaDiariaAdapter = ComidaDiariaAdapter(requireContext(), comidaDiariaModels)
        recyclerView.adapter = comidaDiariaAdapter
        comidaDiariaAdapter.notifyDataSetChanged()

        return root
    }
}



