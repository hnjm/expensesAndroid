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

        val Holder: ViewHolder


        if (convertView == null) {
            expenseView = LayoutInflater.from(context).inflate(R.layout.expense_list_item, null)

            Holder = ViewHolder()
            Holder.name = expenseView.findViewById(R.id.expenseCheckbox)
            Holder.amount = expenseView.findViewById(R.id.amount)

            expenseView.tag = Holder
        } else {
            Holder = convertView.tag as ViewHolder
            expenseView = convertView
        }

        val expense = expenses[position]

        Holder.name?.text = expense.name
        Holder.amount?.setText(expense.amount.toString() + " грн")

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

    private class ViewHolder {
        var name: CheckBox? = null
        var amount: EditText? = null

    }
}