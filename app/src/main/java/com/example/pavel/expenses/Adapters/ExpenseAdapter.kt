package com.example.pavel.expenses.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.EditText
import com.example.pavel.expenses.Model.Expense
import com.example.pavel.expenses.R

class ExpenseAdapter(val context: Context, val expenses: List<Expense>) : BaseAdapter() {
    @SuppressLint("SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val expenseView: View

        expenseView = LayoutInflater.from(context).inflate(R.layout.expense_list_item, null)

        val expenseName: CheckBox = expenseView.findViewById(R.id.expenseCheckbox)
        val expenseAmount: EditText = expenseView.findViewById(R.id.amount)

        val expense = expenses[position]


        expenseName.text = expense.name
        expenseAmount.setText(expense.amount.toString() + " грн")

        return expenseView
    }

    override fun getItem(position: Int): Any {
        return expenses[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return expenses.count()
    }

}