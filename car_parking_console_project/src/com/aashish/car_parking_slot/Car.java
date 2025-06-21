package com.aashish.car_parking_slot;

class Car implements Runnable
{
	private ParkingGarage garage;
	private String carName;

	public Car(ParkingGarage garage, String carName)
	{
		this.garage = garage;
		this.carName = carName;
	}

	@Override 
	public void run()
	{
		
		try
		{
			garage.parkCar(carName);
			Thread.sleep(10000);
			garage.freeSpot(carName);
		}
		catch(InterruptedException e)
		{
			e.getStackTrace();
		}

	
	}
}