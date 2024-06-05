package com.rtee.bankaccountapp

fun main(){

    val rohitsBankAccount = BankAccount("Rohit Tallapragada", 1200.00)
    rohitsBankAccount.deposit(200.00)
    rohitsBankAccount.withdraw(1200.00)
    rohitsBankAccount.deposit(3000.0)
    rohitsBankAccount.deposit(42.5)
    rohitsBankAccount.withdraw(2500.0)

    rohitsBankAccount.displayTransactionHistory()
    rohitsBankAccount.acctBalance()
    val sarahsBankAccount = BankAccount("Sarah", 0.0)
    sarahsBankAccount.deposit(100.0)
    sarahsBankAccount.withdraw(10.0)
    sarahsBankAccount.deposit(300.0)
    sarahsBankAccount.displayTransactionHistory()
    sarahsBankAccount.acctBalance()


}