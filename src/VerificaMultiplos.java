import java.util.Scanner;

public class VerificaMultiplos {
    public static void main(String[] args) {
        // Criação do scanner para leitura de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita os dois valores inteiros
        System.out.print("Digite o primeiro número (A): ");
        int A = sc.nextInt();
        System.out.print("Digite o segundo número (B): ");
        int B = sc.nextInt();

        // Verifica se são múltiplos entre si
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        // Fecha o scanner
        sc.close();
    }
}
