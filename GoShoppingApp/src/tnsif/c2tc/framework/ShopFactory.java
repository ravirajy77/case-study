package tnsif.c2tc.framework;

public interface ShopFactory {

		PrimeAcc getNewPrimeAccount(int accno, String accname, float charges);
		NormalAcc getNewNormalAccount(int accno, String accname, float charges);
}
