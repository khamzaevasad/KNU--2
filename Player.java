package exercise3;

public class Player {
    private String name;
    private int level;
    private Item[] inventory;
    private int playerId;
    private int itemCount;

    private static int totalPlayers = 0;
    private static int nextId = 1001;

    // Player hisobga olinishi uchun flag qo‘shildi
    public Player(String name, boolean countPlayer) {
        this.name = name;
        this.level = 1;
        this.inventory = new Item[10];
        this.itemCount = 0;
        this.playerId = nextId++;
        if (countPlayer) {
            totalPlayers++;
        }
    }

    // Oddiy konstruktorlar
    public Player(String name) {
        this(name, true); // default: hisobga olinadi
    }

    public Player() {
        this("Guest", true);
    }

    public void equipItem(Item item) {
        int totalWeight = 0;
        for (int i = 0; i < itemCount; i++) {
            totalWeight += inventory[i].weight;
        }

        if (totalWeight + item.weight > 100) {
            System.out.println("> 무게 제한(100)을 초과하여 " + item.name + "을(를) 추가할 수 없습니다.");
            return;
        }

        if (itemCount >= inventory.length) {
            System.out.println("> 인벤토리가 가득 찼습니다.");
            return;
        }

        inventory[itemCount++] = item;
        System.out.println("> " + name + "님이 " + item.name + " 아이템을 장착했습니다.");
    }

    public Item unequipItem() {
        if (itemCount == 0) {
            System.out.println("> 인벤토리가 비어있습니다.");
            return null;
        }
        Item removed = inventory[--itemCount];
        inventory[itemCount] = null;
        System.out.println("> " + name + "님이 " + removed.name + " 아이템을 해제했습니다.");
        return removed;
    }

    public void printInventory() {
        if (itemCount == 0) {
            System.out.println("없음");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println(inventory[i]);
            }
        }
    }

    public String getPlayerInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(playerId).append(", 이름: ").append(name)
          .append(" (LV.").append(level).append("), 인벤토리: [");
        if (itemCount == 0) {
            sb.append("없음");
        } else {
            for (int i = 0; i < itemCount; i++) {
                sb.append(inventory[i].name);
                if (i < itemCount - 1) sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public static int getTotalPlayers() {
        return totalPlayers;
    }
}
