// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        for (int aluno = 1; aluno <= 5; aluno++) {


            do {
                System.out.print("Digite a primeira nota do aluno " + aluno + " (0 a 10): ");
                nota1 = sc.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (nota1 < 0 || nota1 > 10);


            do {
                System.out.print("Digite a segunda nota do aluno " + aluno + " (0 a 10): ");
                nota2 = sc.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (nota2 < 0 || nota2 > 10);


            media = (nota1 + nota2) / 2;


            System.out.println("Média do aluno " + aluno + ": " + media + "\n");
        }

        sc.close();
    }
}