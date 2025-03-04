import java.util.Scanner;

abstract class Bank_account{
private long acc_number;
private double balance;
static double interest_rate;
abstract void  calculate_Interest();
void display(){
    System.out.println("Account Number :"+acc_number);
}
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
          System.out.println("Balance of savings account:"+balance);
    }
}
    class current_account extends Bank_account {
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
            interest_rate = 3.50;
              double interest_amount = principle*n*interest_rate/100;
              double balance = principle+interest_amount;
              System.out.println("Balance of current account:"+balance);
        }
    
    public static void main(string_opration[] args) {
        current_account m = new current_account();
        Savings_account n  = new Savings_account();
        m.get();
        m.calculate_Interest();
        n.get();
        n.calculate_Interest();
    }
    
}
