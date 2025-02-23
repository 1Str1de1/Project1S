package OOP.New;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(123456, 100000);

        System.out.println(ba1.toString());
        ba1.withdrawal(50000);
        ba1.withdrawal(100000);
        ba1.deposit(60000);
        ba1.withdrawal(100000);

    }

    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ("Номер аккаунта: " + accountNumber + "\nТекущий баланс: " + balance);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int deposit(int deposit) {
        balance += deposit;
        System.out.println("Счёт пополнен! Текущий баланс счёта: " + balance);
        return balance;
    }

    public int withdrawal(int withdrawal) {
        if (balance > withdrawal) {
            balance -= withdrawal;
            System.out.println("Снятие средств со счёта! Текущий баланс счёта: " + balance);
        } else {
            System.out.println("Недостаточно средств! Вы попытались снять " + withdrawal +
                    " Текущий баланс счёта: " + balance);
        }
        return balance;
    }
}
