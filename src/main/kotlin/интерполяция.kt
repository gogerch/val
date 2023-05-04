fun main(){

    val greetings = "Здравствуйте"
    val space = ' '
    val userName = "Егор"
//    println(greetings+ ". " + userName+ "!" + space + "Какой будет ваш главный вопрос?")

    //Интерполяция строк
//    println("$greetings, $userName! Какой будет ваш главный вопрос?")
//    println("На который можно ответить ${40+2}")

    // многострочная запись
    val multiString= """
            1
         2
                          3
           
    """.trimIndent()

    println(multiString)

}