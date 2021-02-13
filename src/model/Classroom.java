package model;

import java.util.ArrayList;

public class Classroom {
	
	private ArrayList<UserAccount> accounts;
	
	public Classroom () {
		
		this.accounts = new ArrayList<UserAccount>();
	}

	public ArrayList getAccounts() {
		return accounts;
	}

	
	public void addAccounts(String userName, String password, String photo, String gender, String career, String birthday,
			String favoriteBrowser) {
		
		accounts.add(new UserAccount(userName,password,photo,gender,career,birthday,favoriteBrowser));
		
	}
	public boolean verifyAccount(String userName, String password) {
		
		boolean verified = false;
		
		for(int i=0; i<accounts.size() && !verified; i++) {
			
			if(accounts.get(i).getUserName().equals(userName)&& accounts.get(i).getPassword().equals(password)) {
				
				verified = true;
				
			}
		}
		
		return verified;
		
	}

}
