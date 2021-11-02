import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Current Floor is 5");
        System.out.println("Enter destination Floor: (0 to 10):");
        int dest_floor = in.nextInt();
        while(dest_floor<0 || dest_floor>10) {
            System.out.println("This Floor doesn't exist\nEnter destination Floor: (0 to 10):");
             dest_floor = in.nextInt();
        }
        in.close();
        System.out.println("--------------------------------------------");
        new Elevator(dest_floor);
    }
}
