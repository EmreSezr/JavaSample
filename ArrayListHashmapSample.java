public class ArrayListHashmapSample {

	public static void main(String[] args){

	ArrayList<HashMap<String, Integer>> data = new ArrayList<>();
HashMap<String, Integer> map1 = new HashMap<>();
map1.put("Alice", 25);
data.add(map1);
HashMap<String, Integer> map2 = new HashMap<>();
map2.put("Bob", 30);
data.add(map2);
HashMap<String, Integer> map3 = new HashMap<>();
map3.put("Charlie", 35);
data.add(map3);
System.out.println(data.get(1).get("Bob")); // 30
	
	}
}
