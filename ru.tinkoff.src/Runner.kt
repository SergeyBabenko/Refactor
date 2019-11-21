import model.*

fun main() {
    val dog = Pet().apply {
        this.nickname = "Jessie"
        this.age = 1
        this.sex = Sex.FEMALE
    }
    val cat = Pet().apply {
        this.nickname = "Salem"
        this.age = 13
        this.sex = Sex.MALE
    }

    println("${dog.nickname} (age: ${dog.age}) is adult? ${dog.isAdult()}")
    println("${cat.nickname} (age: ${cat.age}) is adult? ${cat.isAdult()}")
    println(dog.respectableNickname)
    println(cat.respectableNickname)
}