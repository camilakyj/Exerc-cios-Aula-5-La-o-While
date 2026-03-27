// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Main {
public    static void main() {

    Scanner entrada = new Scanner(System.in);

    double peso,altura,imc;
    int dentroFaixa = 0;

    for (int i = 1; i<=10; i++) {

        System.out.print("Digite o peso:");
        peso = entrada.nextDouble();

        System.out.print("Digite a altura:");
        altura = entrada.nextDouble();

        imc = peso / (altura*altura);

        if (imc >= 18.5 && imc <= 24.9) {
            dentroFaixa++;

        }
        System.out.println();
    }
    System.out.println("Quantidade de pessoas com IMC normal:"+ dentroFaixa);
    entrada.close();

}


    }