
public class CacheTable {

	private int biggestSeqNum;
	private SensorPacket[] cacheTable;
	
	public CacheTable() {
		
	}
	
	public int getBiggestSeqNum() {
		return biggestSeqNum;
	}
	
	public void addToCache(SensorPacket newPacket) {
		cacheTable[0] = newPacket;
	}
}
