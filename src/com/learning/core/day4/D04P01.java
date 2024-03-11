package com.learning.core.day4;
import java.util.Scanner;


class LowBalanceException extends Exception{
	public LowBalanceException(String message) {
		super(message);
	}
}

class NegativeAmountException extends Exception{
	public NegativeAmountException(String message) {
		super(message);
	}
}

class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (initialBalance < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }
        if (accType.equalsIgnoreCase("Saving") && initialBalance < 1000) {
            throw new LowBalanceException("LowBalance");
        }
        if (accType.equalsIgnoreCase("Current") && initialBalance < 5000) {
            throw new LowBalanceException("LowBalance");
        }
        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equalsIgnoreCase("Saving")) {
            throw new LowBalanceException("LowBalance");
        }
        if (balance < 5000 && accType.equalsIgnoreCase("Current")) {
            throw new LowBalanceException("LowBalance");
        }
        return balance;
    }
}

public class D04P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            
            int accNo = scanner.nextInt();
            String custName = scanner.next();
            String accType = scanner.next();
            float initialBalance = scanner.nextFloat();
            
            BankAccount account = new BankAccount(accNo, custName, accType, initialBalance);
            
            float depositAmt = scanner.nextFloat();
            account.deposit(depositAmt);
            System.out.println(account.getBalance());
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}


