import java.util.*;
class EpMap {
	public static void main(String args[]) {
		Map<String, String> myMap = new HashMap<String, String>();
		int size = 1_000_000;
		for(int i = 0; i < size; i++) {
			String java = "Java";
			String eJavaGuru = "eJavaGuru.com";
			myMap.put(java, eJavaGuru);
			myMap.remove(java);
		}
	}
}