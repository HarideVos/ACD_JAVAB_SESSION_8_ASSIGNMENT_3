package eightpointthree;

public class OBAData extends Thread {
		private double balance;
		OBAData(double balance) {
			this.balance=balance;
		}
		public double getBal() {
			return balance;
		}
		public void withdraw(double amount) {
			balance-=amount;
			
		}
		public void deposit(double amount) {
			balance+=amount;
		}
	}
