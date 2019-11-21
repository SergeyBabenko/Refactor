package model

class Cat : Pet() {
    override fun toString(): String {
        return "Cat(nickname=$nickname, age=$age, sex=$sex)"
    }
}