fun main(){
    val a = 1 + 1
    val b = (1 == 1)

    val userAge = 45
    var comparisonResult = userAge >= AGE_OF_MAJORITY && userAge <= RETIREMENT_AGE
    println("Результат пользователя: $comparisonResult")

}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 77