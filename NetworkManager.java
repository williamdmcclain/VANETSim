import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class NetworkManager {

	private DatagramSocket[] connections;
	
	// Initialize network by reading in config file and establish connections to nodes
	public NetworkManager() {
		
	}
	
	public boolean removeConnection(int node) {
		connections[node] = null;
		return true;
	}
	
	public boolean addConnection() {
		return true;
	}
	
	public void sendPacket(SensorPacket packet) {
		
	}
}
