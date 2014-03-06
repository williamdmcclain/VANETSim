// TODO: create sensor packets and send out every 10ms, SensorPacketFactory?


public class Truck {
	// Truck constants
	private static final int truckLength = 25;	// meters
	
	// Truck data
	private double velocity;		// m/s
	private double acceleration;	// m/s^2
	private int posX;				// 1 unit = 1 meter
	private int posY;				// 1 unit = 1 meter
	
	// Helpers
	private FloodingAlgorithm fa;
	
	public Truck() {
		fa = new FloodingAlgorithm();
	}
	
	public void updatePosition() {
		posX += velocity;
	}
	
	public void formPlatoon() {
		
	}
	
	public void joinPlatoon() {
		
	}
	
	public void leavePlatoon() {
		
	}
	
}
