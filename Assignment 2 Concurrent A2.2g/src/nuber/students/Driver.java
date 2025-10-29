package nuber.students;

public class Driver extends Person {
	
	private Passenger currentPassenger;


	
	public Driver(String driverName, int maxSleep)
	{
		super(driverName, maxSleep);
	}
	
	/**
	 * Stores the provided passenger as the driver's current passenger and then
	 * sleeps the thread for between 0-maxDelay milliseconds.
	 * 
	 * @param newPassenger Passenger to collect
	 * @throws InterruptedException
	 */
	public void pickUpPassenger(Passenger newPassenger)throws InterruptedException
	{
		this.currentPassenger = newPassenger;
        
        Thread.sleep((int) (Math.random() * maxSleep));
	}

	/**
	 * Sleeps the thread for the amount of time returned by the current 
	 * passenger's getTravelTime() function
	 * 
	 * @throws InterruptedException
	 */
	public void driveToDestination() throws InterruptedException {
		Passenger p = this.currentPassenger;
        if (p == null) return; 
        Thread.sleep(p.getTravelTime());
	}
	
}
