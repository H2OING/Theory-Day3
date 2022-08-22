package src;


public class BankAccount{
        private double balance;

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        public BankAccount(){
            setBalance(100);
        }

        public BankAccount(double balance){
            setBalance(balance);
        }

        @Override
        public String toString() {
            return "BankAccount{" + "balance=" + balance + '}';
        }

        double deposit(double amount){
            balance += amount;
            return balance;
        }

        public void withdraw(double amount){
            if(amount < balance) {
                balance -= amount;
                String balance1 = String.valueOf(balance);
                System.out.println("New balance :" + balance1);
            }
            else{
                System.out.println("Cant withdraw ");
            }
        }

        public void printBalance(){
            String balance1 = String.valueOf(balance);
            System.out.println("Balance: " + balance1);
        }

        public void transfer(BankAccount to, double amount){
            if(balance > amount) {
                balance -= amount;
                to.balance += amount;
                System.out.println("Successful transferred " + amount);
            }
            else
                System.out.println( "Not enough funds");
        }
}

