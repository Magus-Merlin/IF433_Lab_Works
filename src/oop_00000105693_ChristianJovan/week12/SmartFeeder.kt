package oop_00000105693_ChristianJovan.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int{
    require(requestedGram > 0) {
        "Porsi Kibble harus lebih dari 0 gr!"
    }

    if(isJammed){
        throw DispenserJamException()
    }

    return availableGram - requestedGram
}