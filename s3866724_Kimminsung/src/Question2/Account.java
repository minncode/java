/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2022C
  Assessment: Test 1
  Author: Kim minsung
  ID: Your student: s3866724
  Created date: 03/12/2022
  Acknowledgement: W6 - Inheritance, https://rmit.instructure.com/courses/113608/pages/w6-inheritance?module_item_id=4524304
*/
package Question2;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount){
        if (amount <= balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("The debit amount is larger than the balance!");
        }
    }

    public void transferTo(Account another, double amount){
        balance -= amount;
        another.balance += amount;
    }

    @Override
    public String toString() {
        return "Account: " +
                "id=" + id + ", name=" + name + ", balance=" + balance;
    }
}
