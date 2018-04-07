package com.example.pavel.expenses.Model

class Expense(val name: String, val amount: Number) {
    override fun toString(): String {
        return "$name: $amount грн"
    }
}