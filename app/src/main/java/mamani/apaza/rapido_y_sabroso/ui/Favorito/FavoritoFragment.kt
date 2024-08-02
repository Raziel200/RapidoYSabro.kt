package mamani.apaza.rapido_y_sabroso.ui.Favorito

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import mamani.apaza.rapido_y_sabroso.R
import mamani.apaza.rapido_y_sabroso.fragments.FragmentAdapter

class FavoritoFragment : Fragment() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var fragmentAdapter: FragmentAdapter
    private lateinit var myContext: FragmentActivity

    override fun onCreateView(
        @NonNull inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_favorito, container, false)

        tabLayout = root.findViewById(R.id.tab_layout)
        viewPager2 = root.findViewById(R.id.view_pager2)

        val fm: FragmentManager = activity?.supportFragmentManager!!
        fragmentAdapter = FragmentAdapter(fm, lifecycle)

        viewPager2.adapter = fragmentAdapter

        tabLayout.addTab(tabLayout.newTab().setText("Presentado"))
        tabLayout.addTab(tabLayout.newTab().setText("Popular"))
        tabLayout.addTab(tabLayout.newTab().setText("Nuevo"))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager2.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}

            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })

        return root
    }
}


