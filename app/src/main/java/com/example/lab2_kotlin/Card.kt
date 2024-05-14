package com.example.lab2_kotlin

data class Card(
    var student: Student,
    var id: String,
    var borrowDate: Int,
    var paymentDate: Int,
    var bookId: Int
)