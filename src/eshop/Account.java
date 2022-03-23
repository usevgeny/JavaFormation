package eshop;

import java.sql.Array;
import java.util.Arrays;
import java.util.Enumeration;

public class Account {
	
	private int id;
	private Transaction[] transactions = new Transaction[2];
	
	
	
	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
			
		// on va élargir le tableau initial 
		Transaction lastTransaction = transactions[transactions.length-1];
		if (lastTransaction!=null) {
			
			transactions = Arrays.copyOf(transactions, transactions.length<<1);
		
		
		}
		
		if (moneyAmount>0) {
			
			for (Transaction t:transactions) {
				
				if (t!=null) {
					t=new Transaction(this, accountTo, moneyAmount, StandartAccountOperations.MONEY_TRANSFER_SEND);
				}
			}
			
		}
		
		
	}
	
	public void withdrawMoney(double moneyAmount) {
	//	<write your code here>
	}
	
	public Transaction[] getTransactions() {
	
		Transaction[] transactionsList = new Transaction[100];
		return transactionsList;
	}
	
	public static class Transaction {
     
		private Account accountFrom;
		private Account accountTo;
		private double moneyAmount;
		private StandartAccountOperations operation;
		public Transaction(Account accountFrom, Account accountTo, double moneyAmount,
				StandartAccountOperations operation) {
			
			this.accountFrom = new Account();
			this.accountTo = accountTo;
			this.moneyAmount = moneyAmount;
			this.operation = operation;
		}
		
		
	}
	
	
	
	
}
