package eshop;


import java.util.Arrays;
import java.util.Enumeration;

public class Account {
	
	private int id;
	private Transaction[] transactions;
	private int transactonIndex = 0;
	
	{
		transactions = new Transaction[10];
	}

	public Account(int id) {
		
		this.id = id;
		
	}
	
	
	
	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
			
		if (accountTo == null) {
			return;
		}
		if (moneyAmount <= 0) {
			return;
		}
		
		// on va élargir le tableau initial 
		Transaction lastTransaction = transactions[transactions.length-1];
		if (lastTransaction!=null) {
			System.out.println("las transactio is not null");
			transactions = Arrays.copyOf(transactions, transactions.length<<1);
		
		
		}
		
		if (moneyAmount>0) {
			
			transactions[transactonIndex++]=new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
			accountTo.receiveMoney(this, moneyAmount);
		}
		
		
	}
	
	
	
	private void receiveMoney(Account accountFrom, double moneyAmount) {
			
		if (accountFrom == null) {
			return;
		}
		if (moneyAmount <= 0) {
			return;
		}
		
		// on va élargir le tableau initial 
		Transaction lastTransaction = transactions[transactions.length-1];
		if (lastTransaction!=null) {
			System.out.println("las transactio is not null");
			transactions = Arrays.copyOf(transactions, transactions.length<<1);
		
		
		}
		
		if (moneyAmount>0) {
			
			transactions[transactonIndex++]=new Transaction(accountFrom, this, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
			
		}
		
		
	}
	
	
	
	
	
	public void withdrawMoney(double moneyAmount) {
	
		
		if (moneyAmount <= 0) {
			return;
		}
		// on va élargir le tableau initial 
		Transaction lastTransaction = transactions[transactions.length-1];
		if (lastTransaction!=null) {
			
			transactions = Arrays.copyOf(transactions, transactions.length<<1);
			
		
		
		}
		
		if (moneyAmount>0) {
			
			
			
			transactions[transactonIndex++]=new Transaction(this, null, moneyAmount, StandardAccountOperations.WITHDRAW);
		}
		
		
		
		
	}
	
	public Transaction[] getTransactions() {
	
			//looking for null transactions first in order to count them all and determine the length of new list
		
			int nonNullTransactionsAmount = 0;
			for (Transaction transaction : transactions) {
				if (transaction != null) {
					nonNullTransactionsAmount++;
				}
			}

			Transaction[] filteredTransactions = new Transaction[nonNullTransactionsAmount];
			int index = 0; // need this counter because it will only triggered when a null transactions is detected
			for (Transaction transaction : transactions) {
				if (transaction != null) {
					filteredTransactions[index++] = transaction; // here are 2 ops: first we assign a walue to the element with the current index, then we increment the current index
				}
			}
			return filteredTransactions;

		}
		
		
	
	
	public static class Transaction {
     
		private Account accountFrom;
		private Account accountTo;
		private double moneyAmount;
		private StandardAccountOperations operation;
		public Transaction(Account accountFrom, Account accountTo, double moneyAmount,
				StandardAccountOperations operation) {
			
			this.accountFrom = accountFrom;
			this.accountTo = accountTo;
			this.moneyAmount = moneyAmount;
			this.operation = operation;
		}
		
		
		
		public Account getAccountFrom() {
			return accountFrom;
		}



		public Account getAccountTo() {
			return accountTo;
		}



		public double getMoneyAmount() {
			return moneyAmount;
		}



		public StandardAccountOperations getOperation() {
			return operation;
		}



		@Override
		public String toString() {
			return "Transaction [accountFrom=" + accountFrom + ", accountTo=" + accountTo
					+ ", moneyAmount=" + moneyAmount + ", operation=" + operation + "]";
		}
		
		
	}
	@Override
	public String toString() {
		return "Account ID: " + this.id;
	}
	
	
	
	
}
