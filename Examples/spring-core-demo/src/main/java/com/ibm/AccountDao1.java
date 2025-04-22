package com.ibm;

public class AccountDao1 implements AccountDao{
	
	private Datasource datasource; // Datasource present in com.ibm

	public AccountDao1() {
		super();
		System.out.println("AccountDao1() created, datasource="+datasource);
	}

	public AccountDao1(Datasource datasource) {
		super();
		this.datasource = datasource;
		System.out.println("AccountDao1(Datasource) created, datasource username="+datasource.getUsername());
	}

	public Datasource getDatasource() {
		return datasource;
	}

	public void setDatasource(Datasource datasource) {
		this.datasource = datasource;
		System.out.println("setDatasource(Datasource) called, username="+datasource.getUsername());
	}

	@Override
	public void testing() {
		System.out.println("testing() in AccountDao1(), datasource username="+datasource.getUsername());
	}
	
}
