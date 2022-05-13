package tnsif.c2tc.application;

import tnsif.c2tc.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accno, String accname, float accbal) {
		super(accno, accname, accbal);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accbal)
	{
		System.out.println("You have withdrawal amount "
							+ accbal + " along with deposited amount "
							+creditLimit);
	}
}
