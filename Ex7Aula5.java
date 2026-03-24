// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int menor = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print ("Digite um numero positivo:");
            numero = entrada.nextInt();

            if (i == 1) {
                menor = numero;

            } else {
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        System.out.print("O menor numero digitado foi:" + menor);

        entrada.close();



    }
}
