package application;

import java.security.DomainLoadStoreParameter;
import java.text.ParseException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Houder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance: ");
			double initBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initBalance, withLimit);
			System.out.print("Enter amount for withdraw: ");
			acc.withdraw(sc.nextDouble());
			System.out.println("New balance: R$" + acc.getBalance());
		}
		catch (DomainException e){
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
