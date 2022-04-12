package com.greenfarm.ui.main

import android.content.Intent
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.greenfarm.R
import com.greenfarm.databinding.ActivityMainBinding
import com.greenfarm.ui.BaseActivity

class MainActivity: BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {


    override fun initAfterBinding() {
        binding.mainSearchBtIv.setOnClickListener{
            val  intent= Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }

        binding.mainHistoryBtIv.setOnClickListener{
            val  intent= Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
    }
}