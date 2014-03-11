
public class FloodingAlgorithm {
	private short addr;
	private CacheTable cache;
	private int[] neighbors;
	private NetworkManager netManager;
	// 10140 - 10149
	public FloodingAlgorithm() {
		cache = new CacheTable();
		netManager = new NetworkManager();
	}
	
	public boolean isPacketForMe(SensorPacket packetIn) {
		// Packet is for this node
		if(packetIn.getSrcAddr() != this.addr) {
			/* If packet is for node, check cache to see if update or forwarding
			* is necessary
			*/
			if(packetIn.getSeqNumber() > cache.getBiggestSeqNum()) {
				// Store new packet in cache table and forward packet
				cache.addToCache(packetIn);
				forwardPacket(packetIn);
			}
			return true;
		}
		return false;
	}
	
	/*
	 * Forwards new packets to its neighbors. If the packet came from neighbor k,
	 * it will not forward back to k.
	 */
	private boolean forwardPacket(SensorPacket packet) {
		for(int i = 0; i < neighbors.length; i++) {
			
		}
		return true;
	}
	
	/*
	 * Calculates the packet drop rate, considers node to be out of range when
	 * drop rate reaches a threshold.
	 */
	public void packetDropRate() {
		
	}
	
	public void run() {
		
	}
}
