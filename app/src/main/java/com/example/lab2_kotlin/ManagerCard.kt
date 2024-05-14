package com.example.lab2_kotlin

class ManagerCard {
    private val cards = ArrayList<Card>()

    fun add(card: Card) {
        cards.add(card)
    }

    fun delete(id: String): Boolean {
        val card = cards.find { it.id == id }
        if (card == null) {
            return false
        }
        cards.remove(card)
        return true
    }

    fun display() {
        if (cards.isEmpty()) {
            println("Danh sách trống.")
        } else {
            cards.forEach {
                println("Mã phiếu mượn: ${it.id}, Ngày mượn: ${it.borrowDate}, Hạn trả: ${it.paymentDate}, Số hiệu sách: ${it.bookId}, Tên sinh viên: ${it.student.name}, Tuổi: ${it.student.age}, Lớp: ${it.student.school}")
            }
        }
    }

}