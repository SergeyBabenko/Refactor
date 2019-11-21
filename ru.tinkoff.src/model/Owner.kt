package model

class Owner<T : Pet>(private val p: T) {
    fun feed() {
        println("Домашнее животное ${p.nickname} накормлено")
    }
}