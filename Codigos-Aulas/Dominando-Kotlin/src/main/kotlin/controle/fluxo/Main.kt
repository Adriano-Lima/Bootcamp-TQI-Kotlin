package controle.fluxo

//iterator
class Animal(val nome:String)
class Zoo(val animais:List<Animal>){
    operator fun iterator():Iterator<Animal>{
        return animais.iterator()
    }
}

//Colecoes -- List
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers
fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}
fun getSysSudoers(): List<Int> {
    return sudoers
}
//Set
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}
fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}

//Map
const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts
fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}
fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {
            k, v -> println("ID $k: credit $v")
    }
}

fun main(){
    //iterator
    val animais = listOf(Animal("Leão"),Animal("Zebra"), Animal("Elefante"))
    val zoo = Zoo(animais)
    for(animal in zoo){
        println("No Zoologico tem: ${animal.nome}")
    }

    //Colecoes -- List
    addSystemUser(4)                                              // 5
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!

    //Set
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")

    //Map
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()


}
