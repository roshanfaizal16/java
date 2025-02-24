import java.util.Scanner;

abstract class Bank_account{
private long acc_number;
private double balance;
static double interest_rate;
abstract void  calculate_Interest();
}
 class Savings_account extends Bank_account {
    Scanner in = new Scanner(System.in);
    void get(){
        System.out.print("Enter account number:");
        long acc_number = in.nextLong();
    }
    void calculate_Interest(){
        System.out.print("Enter principle amount:");
        double principle = in.nextDouble();
        System.out.print("Number of months:");
        int n = in.nextInt();
        interest_rate = 2.55;
          double interest_amount = principle*n*interest_rate/100;
          double balance = principle+interest_amount;
          System.out.println("Balance:"+balance);
    }
    public static void main(String[] args) {
        Savings_account m = new Savings_account();
        m.get();
        m.calculate_Interest();
    }
    
}
