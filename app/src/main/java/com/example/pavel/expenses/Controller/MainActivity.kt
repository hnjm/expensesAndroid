package com.example.pavel.expenses.Controller

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.pavel.expenses.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_monthly -> {
                title = "Monthly Expenses"
                openFragment(MonthlyFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_daily -> {
                title = "Daily Expenses"
                openFragment(DailyFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openFragment(MonthlyFragment.newInstance())

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
