package assignments;
//Author: Amena wooo
//Matric no: 225822
//lab no: 5
//Date: 24/4/2024

public class TestAccounts {

	public static void main(String[] args) {
        // Creating an savingAccount object
		SavingAccount savingAccount = new SavingAccount(5, 2000, "4825395662");
		
		savingAccount.setAnnualInterestRate(4.5);
		savingAccount.withdraw(2500);
		savingAccount.deposit(3000);
		
        // Creating an currentAccount object
        CurrentAccount currentAccount = new CurrentAccount(1, 3000, "AB9873458");
 
		currentAccount.setAnnualInterestRate(5.0);
		currentAccount.withdraw(2500);
		currentAccount.deposit(3000);
        
		//print the saving and current account info 
        System.out.println("saving " + savingAccount.toString());
		System.out.println("\nCurrent " + currentAccount.toString());
		
	
	}

}
