
package mamani.apaza.rapido_y_sabroso.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.adapters.CarroAdapter
import mamani.apaza.rapido_y_sabroso.models.CarroModel

class MiCarritoFragment : Fragment() {

    private lateinit var list: MutableList<CarroModel>
    private lateinit var carroAdapter: CarroAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mi_carrito, container, false)

        recyclerView = view.findViewById(R.id.cart_rec)
        recyclerView.layoutManager = LinearLayoutManager(context)
        list = mutableListOf(
            CarroModel(R.drawable.s1, "Order 1", "$30", "4.3"),
            CarroModel(R.drawable.s2, "Order 2", "$20", "4.6"),
            CarroModel(R.drawable.fav1, "Order 3", "$30", "4.3"),
            CarroModel(R.drawable.s1, "Order 4", "$30", "4.3"),
            CarroModel(R.drawable.s2, "Order 5", "$20", "4.3"),
            CarroModel(R.drawable.fav1, "Order 6", "$40", "4.3")
        )
        carroAdapter = CarroAdapter(list)
        recyclerView.adapter = carroAdapter

        // Configura el clic en el botón "Hacer Orden"
        view.findViewById<TextView>(R.id.inscribirseBtn).setOnClickListener {
            val intent = Intent(context, ConfirmationActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}


/*package mamani.apaza.rapido_y_sabroso.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.adapters.CarroAdapter
import mamani.apaza.rapido_y_sabroso.models.CarroModel

class MiCarritoFragment : Fragment() {

    private lateinit var list: MutableList<CarroModel>
    private lateinit var carroAdapter: CarroAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mi_carrito, container, false)

        recyclerView = view.findViewById(R.id.cart_rec)
        recyclerView.layoutManager = LinearLayoutManager(context)
        list = mutableListOf(
            CarroModel(R.drawable.s1, "Order 1", "$30", "4.3"),
            CarroModel(R.drawable.s2, "Order 2", "$20", "4.6"),
            CarroModel(R.drawable.fav1, "Order 3", "$30", "4.3"),
            CarroModel(R.drawable.s1, "Order 4", "$30", "4.3"),
            CarroModel(R.drawable.s2, "Order 5", "$20", "4.3"),
            CarroModel(R.drawable.fav1, "Order 6", "$40", "4.3")
        )
        carroAdapter = CarroAdapter(list)
        recyclerView.adapter = carroAdapter

        // Configura el clic en el botón "Hacer Orden"
        view.findViewById<TextView>(R.id.inscribirseBtn).setOnClickListener {
            val intent = Intent(context, ConfirmationActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}*/

