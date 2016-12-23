package com.worldpay.service;

public class AuthenticateUser {
	
	public boolean isAuthenticateUser(FileReader file,UserInfo user){
		boolean flag=false;
		
		StringBuffer key = new StringBuffer();
		String name = user.getName().substring(0,2).toLowerCase();
		String DOB = user.getDOB().substring(0,2);
		String phoneNumber = user.getPhoneNumber().substring(0,2);
		key.append(name).append(DOB).append(phoneNumber);
		System.out.println("key before "+key);
		String newKey =key.reverse().toString();
		System.out.println("key "+key);
		String fileData = file.getFileData();
		if(newKey.equals(fileData)){
			flag=true;
		}
		else {
			flag=false;
		}
		
		System.out.println(flag);
		return flag;
	}
	
	

	/*public static void main(String[] args) {

		AuthenticateUser obj = new AuthenticateUser();
		FileReader file = new FileReader();
		UserInfo user = new UserInfo();
		obj.isAuthenticateUser(file,user);

	}*/
}
