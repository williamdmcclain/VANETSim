import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class NetworkManager {

	private DatagramSocket[] connections;
	
	public NetworkManager() {
		
	}
	
	public boolean removeConnection(int node) {
		connections[node] = null;
		return true;
	}
	
	public boolean addConnection() {
		return true;
	}
}
