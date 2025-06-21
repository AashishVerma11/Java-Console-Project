package com.aashish.car_parking_slot;

public class CarParkingProject 
{
	public static void main(String [] args)
	{
		System.out.println("Welcome to D-Mart Parking");
		ParkingGarage p = new ParkingGarage(5);
		System.out.println("Total Available spots are : "+p.getAvailableSpots());
		Car c1 = new Car(p,"Maruti Brezza");
		Car c2 = new Car(p,"Tata Naxon ");
		Car c3 = new Car(p,"Mahindra BE6");
		Car c4 = new Car(p,"Kia Seltos");
		Car c5 = new Car(p,"Honda city");
		Car c6 = new Car(p,"Toyota Fortuner");
		Car c7 = new Car(p,"Hundai i20");

		Thread t1 = new Thread (c1);
		Thread t2 = new Thread (c2);
		Thread t3 = new Thread (c3);
		Thread t4 = new Thread (c4);
		Thread t5 = new Thread (c5);
		Thread t6 = new Thread (c6);
		Thread t7 = new Thread (c7);
		t1.start();	
		t2.start();
		t3.start();
		 t4.start();	t5.start(); 	t6.start(); 	t7.start();
		
		
		System.out.println("Parking garage simulation is complete.");
	}
}
