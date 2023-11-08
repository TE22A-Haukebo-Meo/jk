import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Droppa 5 tal");
        Scanner tb = new Scanner(System.in);
        int[] tal = new int[5];
        tal[0]=tb.nextInt();
        tal[1]=tb.nextInt();
        tal[2]=tb.nextInt();
        tal[3]=tb.nextInt();
        tal[4]=tb.nextInt();
        for(int i=0; i<5;i++){
            System.out.println("I fält "+i+" är talet "+tal[i]);
        }
        
        
    }
}
