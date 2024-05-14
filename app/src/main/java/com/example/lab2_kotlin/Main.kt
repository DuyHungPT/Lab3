package com.example.lab2_kotlin

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val managerTeacher = ManagerTeacher()
    var choice: Int

    do {
        println("Hiển thị lựa chọn cho người dùng")
        println("1 để thêm")
        println("2 để xóa => nhập id. kết quả là boolean")
        println("3 để lấy lương => nhập id. kết quả là double")
        println("4 để thoát")

        print("Nhập lựa chọn của bạn: ")
        choice = scanner.nextInt()

        when (choice) {
            1 -> {
                // Thêm giáo viên
                println("Nhập thông tin giáo viên:")
                print("Tên: ")
                val name = scanner.next()
                print("Tuổi: ")
                val age = scanner.nextInt()
                print("Quê quán: ")
                val hometown = scanner.next()
                print(" Nhap ID: ")
                val id = scanner.next()


                print("Lương cơ bản: ")
                val salary = scanner.nextDouble()
                print("Tiền thưởng: ")
                val bonus = scanner.nextDouble()
                print("Tiền phạt: ")
                val penalty = scanner.nextDouble()
                print("Lương thực lĩnh: ")
                val realSalary = scanner.nextDouble()

                val nguoi = Nguoi( id, name, age, hometown)
                val teacher = CBGV(salary, bonus, penalty, realSalary, nguoi)
                managerTeacher.add(teacher)
                println("Giáo viên đã được thêm vào danh sách.")
                println("Ma Giao Vien La : $id.")
            }
            2 -> {
                // Xóa giáo viên
                print("Nhập ID của giáo viên cần xóa: ")
                val id = scanner.next()
                val deleted = managerTeacher.deleteById(id)
                if (deleted) {
                    println("Giáo viên có ID $id đã được xóa.")
                } else {
                    println("Không tìm thấy giáo viên có ID $id.")
                }
            }
            3 -> {
                // Lấy lương của giáo viên
                print("Nhập ID của giáo viên để lấy lương: ")
                val id = scanner.next()
                val salary = managerTeacher.getSalary(id)
                println("Lương của giáo viên có ID $id là: $salary")
            }
            4 -> {
                // Thoát chương trình
                println("Chương trình đã kết thúc.")
                return
            }
            else -> println("Lựa chọn không hợp lệ.")
        }
    } while (choice != 4)
}
