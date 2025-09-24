package exercise2;

public class Member {
    // Attributes
    private String name;
    private int memberId;
    private int yearsOfMembership;
    private String tier;
    private static int totalMembers = 0;
    
    // Constants
    public static final int SILVER_TIER_YEARS = 3;
    public static final int GOLD_TIER_YEARS = 5;
    
    // Static field for next ID
    private static int nextId = 1001;
    
    // Constructor
    public Member(String name, int years) {
        this.name = name;
        this.yearsOfMembership = years;
        this.memberId = nextId++;
        
        // Determine tier based on years
        if (years >= GOLD_TIER_YEARS) {
            this.tier = "Gold";
        } else if (years >= SILVER_TIER_YEARS) {
            this.tier = "Silver";
        } else {
            this.tier = "Bronze";
        }
        
        totalMembers++;
    }
    
    // toString method
    public String toString() {
        return "Member{ID=" + memberId + ", 이름=" + name + ", 가입기간=" + yearsOfMembership + "년, 등급=" + tier + "}";
    }
    
    // Static method to get total members
    public static int getTotalMembers() {
        return totalMembers;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getMemberId() {
        return memberId;
    }
    
    public int getYearsOfMembership() {
        return yearsOfMembership;
    }
    
    public String getTier() {
        return tier;
    }
}