package com.example.pavel.expenses.Controller

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pavel.expenses.Adapters.ExpenseAdapter
import com.example.pavel.expenses.R
import com.example.pavel.expenses.Services.Expenses
import kotlinx.android.synthetic.main.monthly_expenses.view.*

class MonthlyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.monthly_expenses, container, false)

        view.expenseMonthlyList.adapter = ExpenseAdapter(view.context, Expenses.expensesMonthly)
        return view
    }

    companion object {
        fun newInstance(): MonthlyFragment = MonthlyFragment()
    }
}