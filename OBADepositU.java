package eightpointthree;


public class OBADepositU extends Thread{
	boolean deposit;
	static OBAData act;
	
	OBADepositU(OBAData act,boolean deposit) {
		this.deposit=deposit;
	}
	static void deposit(double transfer) {
		act.deposit(transfer);
	}
	static void withdraw(double amount) {
		if(act.getBal()>amount) {
			act.withdraw(amount);
		}
		else {
			System.out.println("Can't withdraw " + amount + " only have " + act.getBal());
		}
	}
	public void run() {
		for(int i=0;i<500;i++) {
			withdraw(500);
			deposit(250);
		}
	}
}