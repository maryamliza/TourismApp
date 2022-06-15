package com.example.tourismapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    //maps
    //private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        title = "KotlinApp"
//        tabLayout = findViewById(R.id.tabLayout)
//        viewPager = findViewById(R.id.viewPager)
//        tabLayout.addTab(tabLayout.newTab().setText("Entretenimiento"))
//        tabLayout.addTab(tabLayout.newTab().setText("Cultural"))
//
//
//        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
//        val adapter = MyAdapter(
//            this, supportFragmentManager,
//            tabLayout.tabCount
//        )
//        viewPager.adapter = adapter
//        viewPager.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
//        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab) {
//                viewPager.currentItem = tab.position
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab) {}
//            override fun onTabReselected(tab: TabLayout.Tab) {}
//        })

//        //maps
//        createFragment()
    }

    //maps
//    private fun createFragment() {
//        val mapFragment: SupportMapFragment =
//            supportFragmentManager.findFragmentById(R.id.maps) as SupportMapFragment
//        mapFragment.getMapAsync(this)
//    }
//
//    override fun onMapReady(googleMap: GoogleMap) {
//        map= googleMap
//    }
}
