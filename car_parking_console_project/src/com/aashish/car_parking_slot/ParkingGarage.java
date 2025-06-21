package com.aashish.car_parking_slot;

public class ParkingGarage 
{
	private int availableSpots;
	private final int MAX_SPOTS;
	
	public ParkingGarage(int maxSpots)
	{
		this.availableSpots = maxSpots;
		this.MAX_SPOTS = maxSpots;
	}
	
	public synchronized void parkCar(String carName)
	{

		while(availableSpots == 0)
		{
		
			try
			{
				System.out.println(carName+" is waiting for a spot.");
				wait();	
							
			}
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
	
		}		
	
		System.out.println(carName+" parked. Available spot "+--this.availableSpots);
		
		notifyAll();
	}
	

    public synchronized void freeSpot(String carName)
    {
       while(availableSpots == MAX_SPOTS)
	   {
		try
		{
			wait(); // if parking area is empty
		}
		catch(InterruptedException e)
		{
			e.getStackTrace();
		}
	   }

	System.out.println(carName+" left. Available spots: "+(++availableSpots));
	 notify();
    }
    
	public int getAvailableSpots()
	{
		return availableSpots;
	}
}
