fun main(){
    var currentAccount= CurrentAccount("34525623","Rachael Minage",250.00)
currentAccount.deposit(300.00)
    println(currentAccount.balance)
    currentAccount.withdraw(200.00)
    println(currentAccount.balance)
    currentAccount.details()
    var savingsAccount=  SavingsAccount("4567832","Rachael",600.00,2)
    currentAccount.withdraw(250.00)
    println(savingsAccount.balance)

}
open class CurrentAccount(var accountNumber: String,var AccountName: String, var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
    }
 open fun withdraw(amount:Double){
    balance-=amount
}
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $AccountName")
    }
}
class SavingsAccount( accountNumber: String, AccountName: String,  balance:Double,var withdrawals:Int): CurrentAccount(accountNumber,AccountName,balance){
    override fun withdraw(amount: Double) {
        super.withdraw(amount)
        var withdraw =0
        if (withdrawals< 4){
            balance-=amount
           withdrawals = withdraw++

    }




     }




}
data class Product(var name: String, var weight: String,var category: String,var price: Double)


fun product(item: String){

}