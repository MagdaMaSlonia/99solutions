import java.util.Random;
import java.util.Scanner;

public class Loops {

    public Loops() {
        //oneToTen();
        //oddNumbers();
        //squares();
        //random4();
        //even(20);
        //powers(8);
        //areWeThereYet();
        //triangle();
        //square();
        tableSquare(6);
    }

    private void tableSquare(int dimension) {

        for(int i = 1; i <= dimension ; i++) {
            for (int j = 1; j <= dimension ; j++) {
                System.out.print(i * j);
                System.out.print(" | ");
            }
            System.out.print("\n");
        }


    }

    private void triangle() {
        for(int i = 1; i <= 5 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private void square() {
        for(int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private void areWeThereYet() {
        String answer = "No";
        Scanner input = new Scanner(System.in);

        while (!answer.equals("Yes!")) {
            System.out.println("Are we there yet?");
            answer = input.next();
        }
        System.out.println("Good!");
        System.exit(1);
    }

    private void powers(int maxPower) {
        int power = 0;
        while(power <= maxPower) {
            System.out.println((int)Math.pow(2, power));
            power++;
        }
    }

    private void even(int maxNumber) {
        int current = 0;
        while(current < maxNumber) {
            if ( current % 2 == 0 && current != 0) {
                System.out.println(current);
            }
            current ++ ;
        }

    }

    private void random4() {
        Random rand = new Random();

        for(int i = 0; i < 4 ; i++) {
            int number = rand.nextInt(10);
            System.out.println(number);
        }
    }

    private void squares() {
        int i = 0;
        int result = 0;
        while(result < 100) {
            i++;
            result = i * i;
            System.out.println(result);
        }
    }

    private void oddNumbers() {
        for (int i = 0; i < 20 ; i++) {
            if ( i % 2 > 0) {
                System.out.println(i);
            }
        }
    }

    private void oneToTen() {
        for(int i = 0; i < 10 ; i++) {
            System.out.println(i+1);
        }
    }
}
