package oop;


class user
{
	String Name;
	String phone;
	String email;
	int age;
	char gender;
	String address;
}

public class ObjectDemo {

	public static void main(String[] args) {
		// create an object 
		
		user user1=new user();
		user user2=new user();
		System.out.println("User1: "+user1);
		System.out.println("User2: "+user2);
		
		// write data into my object
		// user1 Details
		user1.Name="John";
		user1.phone="7411388428";
		user1.email="john@gmail.com";
		user1.gender='M';
		user1.age=23;
		user1.address="Karnataka";
		
		// User2 details
		user2.Name="joe";
		user2.phone="8248831138";
		user2.email="joe@hotmail.com";
		user2.gender='M';
		user2.age=26;
		user2.address="Mysore";
		
		//Read the data
		System.out.println("User1 ---> Name:"+user1.Name + "\tPhone:"+user1.phone+"\tAge:"+user1.age+"\t Gender:" +user1.gender);
		System.out.println("User2 ---> Name:"+user2.Name + "\tPhone:"+user2.phone+"\tAge:"+user2.age+"\t Gender:" +user2.gender);
	}

}
