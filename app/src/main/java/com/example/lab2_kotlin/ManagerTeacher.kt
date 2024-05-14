package com.example.lab2_kotlin

class ManagerTeacher {
    private val teachers = ArrayList<CBGV>()

    fun add(teacher: CBGV) {
        teachers.add(teacher)
    }

    fun deleteById(id: String): Boolean {
        val teacher = teachers.find { it.nguoi.id == id }
        if (teacher == null) {
            return false
        }
        teachers.remove(teacher)
        return true
    }

    fun getSalary(id: String): Double {
        val teacher = teachers.find { it.nguoi.id == id }
        if (teacher == null) {
            return 0.0
        }
        return teacher.salary + teacher.bonus - teacher.penalty
    }
}