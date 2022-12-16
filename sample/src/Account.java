/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2022C
  Assessment: Test 1
  Author: Kim minsung
  ID: Your student: s3866724
  Created date: 03/12/2022
  Acknowledgement: Acknowledge the resources that you use here.
*/

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0)
            this.balance = 0;
        else
            this.balance = initialBalance;
    }

    public void credit(double amount){
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
