class Account {
    String customerName;
    String accType;
    int accNum;

    double balance = 1000;

    void deposit(int amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println("The balance in the account is : " + balance);
    }
}

class SavAcct extends Account {
    int n = 4;
    double r = 0.07;

    void interest(double y) {
        balance = Math.pow((balance * (1 + (r / n))), n * y);
    }

    void withdrawal(int amount) {
        balance -= amount;
    }
}

class CurrAcct extends Account {
    int minBalance = 1000, penalty = 7;

    void withdrawal(int amount) {
        balance -= amount;
        if (balance < minBalance) {
            balance -= penalty;
        }
    }
}
