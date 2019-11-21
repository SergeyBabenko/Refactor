import model.Pet

fun Pet.isAdult(): Boolean = this.age >= 2

val Pet.respectableNickname: String
    get() = "Dear ${this.nickname}"