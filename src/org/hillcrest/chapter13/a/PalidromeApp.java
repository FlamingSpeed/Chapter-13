package org.hillcrest.chapter13.a;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class PalidromeApp {
    public static void main(String[] args) throws IOException{
        String value="";
        try{
            System.out.print("Please enter the line you want to check if it is a Palindrome:");
            Scanner scanner = new Scanner(System.in);
            int line = scanner.nextInt();
            value = Files.readAllLines(Paths.get("temp.txt")).get(line-1);
            var isPalidrome = Palindrome.isPalindrome(value);
            if(isPalidrome){
                System.out.printf("The line %s is a Palindrome.",value);
            }else{
                System.out.printf("The line %s is not a Palindrome.",value);
            }
        }catch(IndexOutOfBoundsException outOfBoundsException){
            System.out.println("Please don't do that");
        }

    }
}
