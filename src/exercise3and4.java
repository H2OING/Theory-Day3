package src;

public class exercise3and4{
        public static void main(String args[]){

            BankAccount A = new BankAccount(2000);
            BankAccount B = new BankAccount(5000);

            A.printBalance();
            B.printBalance();

            A.transfer(B, 1000);

            A.printBalance();
            B.printBalance();

            A.withdraw(1001);
        }
}

