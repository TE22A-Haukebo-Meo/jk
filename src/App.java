import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hur många * vill du ha?");
        Scanner tb = new Scanner(System.in);
        int tal = tb.nextInt();
        System.out.println("Cuantos kolumner vill du ah?");
        int column = tb.nextInt();
        for (int j=0; j<column; j++){
            System.out.println();
            for (int i=0; i<tal; i++){
                System.out.print("*");
                }
        }
        }
}

