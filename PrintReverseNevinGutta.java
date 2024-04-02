import java.util.Scanner;
// Name: <Nevin Gutta>

// Class: CS 3305

// Term: Spring 2024

// Instructor: Umama Tasnim

public class PrintReverseNevinGutta {
    //Reverse String method using Recursion
    public static String PrintReverse(String word){
        //terminating condition to prevent infinite recursion
        if (word == null || word.length() <= 1){
            return word;
        }
        else{
            //Takes out the first letter of the word recursively and places it in reverse order
            return PrintReverse(word.substring(1)) + word.charAt(0);
        }
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        //while loop so program keeps running until user 
        while (x != 2){
            x = 0;
            System.out.print("Entered String: ");
            String word = input.nextLine();
            String reversedWord = PrintReverse(word);


            System.out.print("Reversed String: " + reversedWord);
            System.out.println();

            while(x != 1){
                System.out.print("Try again(Y/N):");
                String tryAgain = input.nextLine();
                System.out.println();

                if (tryAgain.equalsIgnoreCase("N")){
                    x = 0;
                    System.exit(0);
                }
                else if (tryAgain.equalsIgnoreCase("Y")){
                    x = 1;
                }
                else{
                    System.out.println ("Invalid input");
                    System.out.println();

                }
            }
        }
    }
}