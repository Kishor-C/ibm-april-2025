package com.ibm;

enum LoanType {
	VEHICLE, HOUSE, PERSONAL, EDUCATIONAL
}
class Loan {
	int loanId;
	LoanType type;
	
	Loan(int loanId, LoanType type) {
		this.loanId = loanId;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", type=" + type + "]";
	}
}
public class TestEnums {
	public static void main(String[] args) {
		Loan house = new Loan(12345, LoanType.HOUSE);
		Loan personal = new Loan(45678, LoanType.PERSONAL);
		System.out.println(house);
		System.out.println(personal);
		// you can use values() method to get all the enum values, it returns an array
		LoanType[] loans = LoanType.values();
		for(LoanType type : loans) System.out.println(type);
		System.out.println("_______________________________________");
		// Thread class has an inner enum called State, displays all the states a thread could go 
		Thread.State[] states = Thread.State.values();
		// use for loop to print all the states
		for(Thread.State state : states) {
			System.out.println(state);
		}
	}
}
