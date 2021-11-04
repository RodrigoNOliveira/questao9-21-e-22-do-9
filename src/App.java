import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int nmr = scanner.nextInt();
        int contador = nmr;
        int x = 0;
        int soma;
        if (nmr < 0) {
            System.out.println("Número negativo:");

        } else {

            while (contador >= 1) {

                if (nmr % contador == 0) {

                    x = contador + x;
                }
                contador--;
                ;
            }
            soma = x - nmr;
            System.out.println("A soma dos divisores de " + nmr + " com exceção dele proprio é: " + soma);
        }

    }
}