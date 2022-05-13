package tnsif.c2tc.framework;

public interface BankFactory 
{
	SavingAcc getNewSavingAcc(int accno, String accname, float accbal);
	CurrentAcc getNewCurrentAcc(int accno, String accname, float accbal);
	
}
