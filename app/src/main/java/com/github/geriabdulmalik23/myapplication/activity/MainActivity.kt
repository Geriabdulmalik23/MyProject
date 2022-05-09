package com.github.geriabdulmalik23.myapplication.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.github.geriabdulmalik23.myapplication.R
import com.github.geriabdulmalik23.myapplication.databinding.ActivityMainBinding
import com.github.geriabdulmalik23.myapplication.fragment.BarayaFragment
import com.github.geriabdulmalik23.myapplication.fragment.BlogFragment
import com.github.geriabdulmalik23.myapplication.fragment.EventFragment
import com.github.geriabdulmalik23.myapplication.fragment.HomeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityMainBinding
    val binding: ActivityMainBinding
        get() = mViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(HomeFragment.newInstance())
        binding.mBottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.mHome -> {
                    loadFragment(HomeFragment.newInstance())
                    true
                }
                R.id.mBlog -> {
                    loadFragment(BlogFragment.newInstance())
                    true
                }
                R.id.mEvent -> {
                    loadFragment(EventFragment.newInstance())
                    true
                }
                R.id.mBaraya -> {
                    loadFragment(BarayaFragment.newInstance())
                    true
                }
                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }
}
