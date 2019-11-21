package model

class Dog : Pet() {
    override fun toString(): String {
        return "models.Dog(nickname=$nickname, age=$age, sex=$sex)"
    }
}
