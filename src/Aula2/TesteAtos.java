package Aula2;

import java.util.Scanner;

public class TesteAtos {
    public static void main(String[] args) {

        float n1 = 0;
        float n2 = 0;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número: ");
            n1 = Float.parseFloat(s.nextLine());
            System.out.println("O número 1 é: " + n1);
            n2 = Float.parseFloat(s.nextLine());
            System.out.println("O número 2 é: " + n2);

            if (n1 == 0 || n2 == 0) {
                System.out.println("Não foi possível realizar a operação, tente novamente.");
            } else {
                float soma1 = (n1 + n2) / 2;
                float soma = n1 + n2;
                System.out.println("O resultado da soma dos números é: " + soma);
                System.out.println("O resultado da média aritmética é: " + soma1);
                break;
            }
        }
        s.close();
    }
}

