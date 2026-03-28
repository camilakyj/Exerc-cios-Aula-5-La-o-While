// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Main {
public    static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int codigo, quantidade;
    double preco = 0, totalProduto, totalGeral = 0;
    char continuar;

            do {
                System.out.print("Digite o codigo do produto:");
                codigo = entrada.nextInt();

                System.out.print("Digite a quantidade:");
                quantidade = entrada.nextInt();

                switch (codigo) {
                    case 100:
                        preco = 1.20;
                        break;
                    case 101:
                        preco = 1.30;
                        break;
                    case 102:
                        preco = 1.50;
                        break;
                    case 103:
                        preco = 1.20;
                        break;
                    case 104:
                        preco = 1.30;
                        break;
                    case 105:
                        preco = 1.00;
                        break;
                    default:
                        System.out.println("Código inválido!");
                        preco = 0;
                }
                totalProduto = preco * quantidade;
                totalGeral += totalProduto;

                System.out.println("Total deste produto:" + totalProduto);

                System.out.print("Deseje continuar comprando? (s/n):");
                continuar = entrada.next().charAt(0);

                System.out.println();

            } while (continuar == 's' || continuar == 'S');
            System.out.println("Total geral da compra:" + totalGeral);

            entrada.close();

            }

            }


