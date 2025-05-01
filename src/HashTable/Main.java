package HashTable;

public class Main {

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.printTable();

        myHashTable.put("nails", 100);
        myHashTable.put("tails", 100);
        myHashTable.put("lumber", 100);

        myHashTable.put("bolts", 200);
        myHashTable.put("screws", 140);
        myHashTable.put("nails", 190);

        myHashTable.printTable();

        System.out.println("Getting values");
        System.out.println(myHashTable.get("nails"));
        System.out.println(myHashTable.get("screws"));
        System.out.println(myHashTable.get("houses"));
    }
}
