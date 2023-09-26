import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int r=random.nextInt(11);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your guess: ");
        int guess=scanner.nextInt();
        while(guess!=r){
            if (guess<r) {
                System.out.println("The stored number is greater than "+guess);
            }
            else if (guess>r) {
                System.out.println("The stored number is smaller than "+guess);
            }
            System.out.print("Please enter your guess: ");
            guess=scanner.nextInt();
        }
        System.out.println(" You have found the stored number "+guess);
        }
    }
