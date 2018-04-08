package com.example.pavel.expenses.Services

import com.example.pavel.expenses.Model.Expense

object Expenses {
    val expensesMonthly = listOf(
            Expense("home", 4000),
            Expense("commute", 1000),
            Expense("food", 3000),
            Expense("Internet", 145)
    )
    val expensesDaily = listOf(
            Expense("Маршрутка", 10),
            Expense("Мамуля", 50),
            Expense("Пицца", 45)
    )
}