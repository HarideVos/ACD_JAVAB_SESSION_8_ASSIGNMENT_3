package eightpointthree;

public class OnlineBankingMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OBAData b1=new OBAData(500);
		System.out.println("Start balance is "+ b1.getBal());
		OBADepositS s1 = new OBADepositS(b1, false);
		OBADepositU u1 = new OBADepositU(b1, false);
		s1.start();
		System.out.println("End balance after synchronized is " + b1.getBal());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		u1.start();
		
		System.out.println("End balance after unsynchronized is " + b1.getBal());
	}
}