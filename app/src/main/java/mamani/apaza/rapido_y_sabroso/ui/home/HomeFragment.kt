package mamani.apaza.rapido_y_sabroso.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.adapters.HomeHorAdapter
import mamani.apaza.rapido_y_sabroso.adapters.HomeVerAdapter
import mamani.apaza.rapido_y_sabroso.adapters.UpdateVerticalRec
import mamani.apaza.rapido_y_sabroso.databinding.FragmentHomeBinding
import mamani.apaza.rapido_y_sabroso.models.HomeHorModel
import mamani.apaza.rapido_y_sabroso.models.HomeVerModel

class HomeFragment : Fragment(), UpdateVerticalRec {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeHorModelList: ArrayList<HomeHorModel>
    private lateinit var homeHorAdapter: HomeHorAdapter
    private lateinit var homeVerModelList: ArrayList<HomeVerModel>
    private lateinit var homeVerAdapter: HomeVerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root = binding.root

        // Configuración del RecyclerView horizontal
        homeHorModelList = arrayListOf(
            HomeHorModel(R.drawable.pizza, "Pizza"),
            HomeHorModel(R.drawable.hamburger, "Hamburger"),
            HomeHorModel(R.drawable.fried_potatoes, "Fries"),
            HomeHorModel(R.drawable.ice_cream, "Ice Cream"),
            HomeHorModel(R.drawable.sandwich, "Sandwich")
        )

        homeHorAdapter = HomeHorAdapter(this, requireActivity(), homeHorModelList)
        binding.homeHorRec.apply {
            adapter = homeHorAdapter
            layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.HORIZONTAL, false)
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
        }

        // Configuración del RecyclerView vertical
        homeVerModelList = arrayListOf()

        homeVerAdapter = HomeVerAdapter(requireContext(), homeVerModelList)
        binding.homeVerRec.apply {
            adapter = homeVerAdapter
            layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false)
        }

        return root
    }

    override fun callBack(position: Int, list: ArrayList<HomeVerModel>) {
        homeVerAdapter = HomeVerAdapter(requireContext(), list)
        binding.homeVerRec.adapter = homeVerAdapter
        homeVerAdapter.notifyDataSetChanged()
    }
}


