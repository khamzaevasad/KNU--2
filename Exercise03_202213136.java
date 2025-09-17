package exercise3;

import java.util.Scanner;

public class Exercise03_202213136 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();
        

        String[] words = input.split(" ");
        
        String longestWord = "";
        
      
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println("가장 긴 단어: " + longestWord);
        
        scanner.close();
    }
}