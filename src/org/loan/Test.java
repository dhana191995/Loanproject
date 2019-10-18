package org.loan;

public class Test extends Bank{
@Override
public void axis() {
	// TODO Auto-generated method stub
System.out.println("Axis Bank");	
}
@Override
	public void icici() {
		// TODO Auto-generated method stub
	System.out.println("Icici Bank");	
	}
@Override
	public void hdfc() {
		// TODO Auto-generated method stub
	System.out.println("Hdfc Bank");	
	}
public static void main(String[] args) {
	Test t=new Test();
	t.axis();
	t.hdfc();
	t.icici();
	t.sbi();
}
}
