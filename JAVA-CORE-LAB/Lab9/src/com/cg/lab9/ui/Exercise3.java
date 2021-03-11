package com.cg.lab9.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@FunctionalInterface
interface UserNameAndPassword {

	public boolean authenticate(String userName,String password);
}
public class Exercise3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the UserName : ");
		String userName=scan.next();
		System.out.println("Enter the Password : ");
		String password=scan.next();
		UserNameAndPassword isLogged=(uName, pass) -> {
			Map<String,String> details= new HashMap<String,String>();
			details.put("VenkataSai123", "Venkata@Sai");
			details.put("VenkataSai124", "Venkata@Sai12");
			details.put("VenkataSai125", "Venkata@Sai13");
			details.put("VenkataSai126", "Venkata@Sai14");
			boolean isValid=false;
			if(details.containsKey(userName)) {
				if(details.get(userName).equals(password)) {
					isValid=true;
				}
			}
			return isValid;
		};
		if(isLogged.authenticate(userName, password)) {
			System.out.println("You are Logged In");
		}else {
			System.out.println("Login Failed ");
		}
		
		scan.close();
	}

}
