package tnsif.c2tc.framework;

public class CurrentAcc extends BankAcc{

	protected final float creditLimit=20000;
	
	public CurrentAcc(int accno, String accname, float accbal) {
		super(accno, accname, accbal);
		// TODO Auto-generated constructor stub
	}

}
