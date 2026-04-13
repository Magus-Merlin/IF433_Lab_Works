package oop_00000105693_ChristianJovan.week08

object DatabaseMock {
    fun findUser(id : Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "Test@test") else null
    }
}

fun runMockUnitTests() {
    println("\n======= RUNNING UNIT TEST  ========")
    val testUser = DatabaseMock.findUser(1)
    val initial = testUser!!.name.substring(0, 1)

    check(initial == "T") { "Test Failed! Initial is wrong."}
    println("Test Passed: Inisial is T")
}