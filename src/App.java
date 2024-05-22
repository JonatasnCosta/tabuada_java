import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Digite o valor da tabuada:");
        int num = scanner.nextInt();

        for(int i= 0; i<= 10; i++){
            
            System.out.println(num + " x " + i + " = " + num*i );
        }

        scanner.close();
    }
}
