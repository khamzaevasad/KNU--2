package exercise3;

public class Item {
    public String name;
    public int weight;
    public int cost;
    public int itemId;

    private static int totalItems = 0;
    private static int nextId = 1;

    public Item(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.itemId = nextId++;
        totalItems++;
    }

    @Override
    public String toString() {
        return "Item{ID=" + itemId + ", name=" + name + ", weight=" + weight + ", cost=" + cost + "}";
    }

    public static int getTotalItems() {
        return totalItems;
    }
}
