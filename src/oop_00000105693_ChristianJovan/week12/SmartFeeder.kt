package oop_00000105693_ChristianJovan.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int{
    require(requestedGram > 0) {
        "Porsi Kibble harus lebih dari 0 gr!"
    }

    if(isJammed){
        throw DispenserJamException()
    }

    if(requestedGram > availableGram){
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main(){
    var currentKibbleStock = 50

    try{
        dispenseKibble(80, currentKibbleStock ,false)
    } catch (e: DispenserJamException){
      println("${e.message}")
    } catch (e: FoodEmptyException){
      println("${e.message}")
    } catch (e : Exception){
        println("Uh-oh, something went wrong!")
    }
}