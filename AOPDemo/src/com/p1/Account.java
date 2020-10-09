package com.p1;
import java.io.Serializable;
import java.sql.Date;

public class Account implements Serializable {
	private int accno;
	private String name;
	private double balance;	
	public Account() {
		System.out.println("AccountBean created...");
	}

	public int getAccno() {
	System.out.println("In getAccno  .."+accno);
		return accno;
	}
	//setter injection

	public void setAccno(int accno) {
		this.accno = accno;
		System.out.println("In setAccno "+accno);
	}

	public String getName() {
		System.out.println("In getName  :"+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	System.out.println("In setName  "+name);
	}

	public double getBalance() {
		System.out.println("In getBalance  "+balance);
		return balance;
	}

	public void setBalance(double balance) {
		System.out.println("In setBalance "+balance);
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance +"]";
	}

	public Account(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}

}
