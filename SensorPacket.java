
public class SensorPacket {

	private static final short BROADCAST = Short.MAX_VALUE;
	private static final int maxPacketSize = 4096;
	// Packet Header
	private int seqNumber;
	// Java short is 2 bytes, use for 16-bit address
	private short dstAddr;
	private short srcAddr;
	private short prevHop;
	
	// Packet Contents
	private double velocity;
	private double acceleration;
	private int posX;
	private int posY;
	
	public SensorPacket() {
		
	}
	
	public int getSeqNumber() {
		return seqNumber;
	}
	public short getSrcAddr() {
		return srcAddr;
	}
	
	public short getDstAddr() {
		return dstAddr;
	}
	
	public short getPrevHop() {
		return prevHop;
	}
	
	public double getVelocity() {
		return velocity;
	}
	
	public double getAcceleration() {
		return acceleration;
	}
	
	public int getPositionX() {
		return posX;
	}
	
	public int getPositionY() {
		return posY;
	}
	
	public void setVelocity(double velocityIn) {
		velocity = velocityIn;
	}
	
	public void setAcceleration(double accelerationIn) {
		acceleration = accelerationIn;
	}
	
	public void setPositionX(int x) {
		posX = x;
	}
	
	public void setPositionY(int y) {
		posY = y;
	}
}
