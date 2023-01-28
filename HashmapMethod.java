public class HashmapMethod {

	public static void main(String[] args){
  
    HashMap<String, Integer> map = new HashMap<>();

// put() metodu ile anahtar-değer çiftleri ekleyebiliriz
map.put("Alice", 25);
map.put("Bob", 30);
map.put("Charlie", 35);

// size() metodu ile HashMap'in boyutunu alabiliriz
System.out.println("Map size: " + map.size()); // Map size: 3

// get() metodu ile anahtar ile eşleşen değeri alabiliriz
System.out.println("Bob's age: " + map.get("Bob")); // Bob's age: 30

// containsKey() metodu ile belirli bir anahtarın HashMap'de olup olmadığını kontrol edebiliriz
System.out.println("Contains key 'Bob': " + map.containsKey("Bob")); // Contains key 'Bob': true

// remove() metodu ile belirli bir anahtar-değer çiftini HashMap'den silebiliriz
map.remove("Bob");
System.out.println("Map size after removal: " + map.size()); // Map size after removal: 2

// clear() metodu ile HashMap'i temizleyebiliriz
map.clear();
System.out.println("Map size after clear: " + map.size()); // Map size after clear: 0
	
	}
}


