package oop_00000105693_ChristianJovan.week08

fun main(){
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val apiParser = ApiParser()

    for(raw in rawApiData){
        try{
            val product = apiParser.parseProduct(raw)

            product?.let {
                apiParser.checkout(it)
            }?: println("LOG WARNING: Product type not found.\n")
        } catch (e: IllegalArgumentException){
            println("ERROR: Product type not found.\n")
        }
    }

    //Untuk pengeditan ApiParser.checkout, dimana saya edit apa saja yang ditampilkan, sudah dilakukan di commit-19.
}