package com.example.lab2_kotlin

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val managerCard = ManagerCard()
    while (true) {
        println("Hiển thị lựa chọn cho người dùng")
        println("1 để thêm")
        println("2 để xóa => nhập mã phiếu mượn. kết quả là boolean")
        println("3 để hiển thị thông tin các thẻ mượn")
        println("4 để thoát")

        print("Nhập lựa chọn của bạn: ")
        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                // Thêm thẻ mượn sách
                println("Nhập thông tin thẻ mượn sách:")
                print("Mã phiếu mượn: ")
                val id = scanner.next()
                print("Ngày mượn: ")
                val borrowDate = scanner.nextInt()
                print("Hạn trả: ")
                val paymentDate = scanner.nextInt()
                print("Số hiệu sách: ")
                val bookId = scanner.nextInt()
                print("Tên sinh viên: ")
                val name = scanner.next()
                print("Tuổi: ")
                val age = scanner.nextInt()
                print("Lớp: ")
                val school = scanner.next()

                val student = Student(name, age, school)
                val card = Card(student, id, borrowDate, paymentDate, bookId)
                managerCard.add(card)
                println("Thẻ mượn sách đã được thêm vào danh sách.")
            }
            2 -> {
                // Xóa thẻ mượn sách
                print("Nhập mã phiếu mượn của thẻ cần xóa: ")
                val id = scanner.next()
                val deleted = managerCard.delete(id)
                if (deleted) {
                    println("Thẻ mượn sách có mã $id đã được xóa.")
                } else {
                    println("Không tìm thấy thẻ mượn sách có mã $id.")
                }
            }
            3 -> {
                // Hiển thị thông tin các thẻ mượn sách
                println("Thông tin các thẻ mượn sách:")
                managerCard.display()
            }
            4 -> {
                // Thoát chương trình
                println("Chương trình đã kết thúc.")
                return
            }
            else -> println("Lựa chọn không hợp lệ.")
        }
    }
}