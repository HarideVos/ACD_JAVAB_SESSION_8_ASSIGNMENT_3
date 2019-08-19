package eightpointthree;

public class OBADepositS extends Thread{
	boolean deposit;
	static OBAData act;
	
	OBADepositS(OBAData act,boolean deposit) {
		this.act = act;
		this.deposit = deposit;
	}
	synchronized static void deposit(double transfer) {
		act.deposit(transfer);
	}
	synchronized static void withdraw(double amount) {
		if(act.getBal()>amount) {
			act.withdraw(amount);
		}
		else {
			System.out.println("You can't withdraw " 
		+ amount + ". You only have " + act.getBal());
		}
	}
	synchronized public void run() {
		for(int i=0;i<500;i++) {
			withdraw(250);
			deposit(100);
		}
	}
}