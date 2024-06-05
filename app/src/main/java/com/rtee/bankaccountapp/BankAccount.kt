package com.rtee.bankaccountapp

class BankAccount(var accountHolder: String,
                  var balance : Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance+=amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount: Double){
        if(amount<= balance){
            balance-=amount
            transactionHistory.add("$accountHolder deposited $$amount")
        } else {
            println("Insufficient funds in your account")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder :")
        for(transaction in transactionHistory){
            println(transaction)
        }

    }
    fun acctBalance(){
        println("$accountHolder's current balance is $$balance")
    }
}