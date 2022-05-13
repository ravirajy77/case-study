import tnsif.c2tc.application.MMBankFactory;
import tnsif.c2tc.application.MMCurrentAcc;
import tnsif.c2tc.application.MMSavingAcc;
import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;

public class BankTransaction {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(123,"Nayana",10000);
		sa.withdraw(1000);
		sa.deposite(5000);
		CurrentAcc ca=new MMCurrentAcc(1234,"punam",500);
		ca.withdraw(500);
		ca.deposite(500);
	}

}
