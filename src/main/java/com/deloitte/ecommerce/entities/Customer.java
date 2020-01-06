package com.deloitte.ecommerce.entities;

public class Customer {
	private String mobileno;
	private String name;
	private double balance;
	private String password;
	
	
	public Customer() {
		this("","",0,"");
	}
	
	public Customer(String mobileno, String name, double balance,String password) {
		this.mobileno = mobileno;
		this.name = name;
		this.balance = balance;
		this.password = password;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	@Override
    public String toString() {
        String display=mobileno+" "+name +" "+balance;
        return display;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==(this)){
            return true;
        }
        if(obj ==null|| !(obj instanceof Customer)){
            return false;
        }
        Customer e=(Customer)obj;
        return e.mobileno.equals(this.mobileno);
    }

    @Override
    public int hashCode() {
        return mobileno.hashCode();
    }

}
