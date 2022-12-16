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

public class SavingAccount extends Account {
    private double savingInterestRate;

    public SavingAccount(String id, String name, double savingInterestRate) {
        super(id, name);
        this.savingInterestRate = savingInterestRate;
    }

    public SavingAccount(String id, String name, double balance, double savingInterestRate) {
        super(id, name, balance);
        this.savingInterestRate = savingInterestRate;
    }

    public void calculateInterestAmount() {
        double interest = getBalance() * savingInterestRate;
        credit(interest);
    }

    public double getSavingInterestRate() {
        return savingInterestRate;
    }

    public void setSavingInterestRate(double savingInterestRate) {
        this.savingInterestRate = savingInterestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount: " + super.toString() +", "+ "InterestRate=" + savingInterestRate;
    }
}
