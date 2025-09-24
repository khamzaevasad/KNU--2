package exercise1;

public class Book {
  
    private String title;
    private String author;
    private int borrowCount;
    private boolean isAvailable;
    
 
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.borrowCount = 0;
    }
    
   
    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.borrowCount = 0;
    }
    
   
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            borrowCount++;
            return true;
        } else {
            return false;
        }
    }
    
   
    public void returnBook() {
        isAvailable = true;
    }
    
  
    public void printInfo() {
        System.out.println(title + "(" + author + ") - 총 대출 횟수: " + borrowCount + 
                          ", 대출 가능 여부: " + isAvailable);
    }
    
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getBorrowCount() {
        return borrowCount;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
}



