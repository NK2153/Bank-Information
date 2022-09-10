package org.bike;

public class Bikenk implements Bike,Ktm {

	@Override
	public void money() {
System.out.println("34567");		
	}

	@Override
	public void cost() {
System.out.println("34567567");	

	}

	@Override
	public void speed() {
System.out.println("sdfgh");		
	}

	@Override
	public void look() {
System.out.println("vghtrdcvbn");		
	}
public static void main(String[] args) {
	Bikenk aa = new Bikenk();
	aa.money();
	aa.cost();
	aa.speed();
	aa.look();
}
}
