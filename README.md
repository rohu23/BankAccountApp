Simple Bank Account App
A basic implementation of a bank account system in Kotlin.

Features
Create a new bank account with an initial balance
Deposit funds into the account
Withdraw funds from the account
Display the transaction history
Check the current balance
Getting Started
Prerequisites
Make sure you have the following installed on your system:

Kotlin
Any compatible IDE (e.g., IntelliJ IDEA)

Installation:

Clone the repository: git clone https://github.com/rohu23/BankAccountApp.git

Open the project in your preferred IDE.

Build the project to ensure all dependencies are resolved.

Usage
Running the Program
To run the bank account program, use the following command in your IDE:

Open the BankMain.kt file.
Click the run button or use the appropriate command for your IDE.

Example
Here is an example of how to use the bank account system:

package com.rtee.bankaccountapp

fun main() {
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

BankAccount.kt: 

package com.rtee.bankaccountapp

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            println("Insufficient funds in your account")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder:")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }

    fun acctBalance() {
        println("$accountHolder's current balance is $$balance")
    }
}

Contributing
Contributions are welcome! Please follow these steps to contribute:

Fork the repository
Create a new branch (git checkout -b feature/your-feature)
Commit your changes (git commit -m 'Add some feature')
Push to the branch (git push origin feature/your-feature)
Open a pull request
