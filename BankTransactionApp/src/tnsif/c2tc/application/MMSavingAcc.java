package tnsif.c2tc.application;

import tnsif.c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accno, String accname, float accbal) {
		super(accno, accname, accbal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccname()=" + getAccname() + ", getAccbal()=" + getAccbal() + 
				"]";
	}
	
}
