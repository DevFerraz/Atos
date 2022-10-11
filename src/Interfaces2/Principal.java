package Interfaces2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoal pessoal = new Pessoal();
        Profissional profissional = new Profissional();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do seu compromisso pessoal: ");
        String compromissop1 = scan.nextLine();
        System.out.println("Digite a data do seu compromisso: ");
        String data1 = scan.nextLine();
        System.out.println("Digite o horário do seu compromisso: ");
        String hora1 = scan.nextLine();

        System.out.println("Digite o nome do seu compromisso profissional: ");
        String compromissop2 = scan.nextLine();
        System.out.println("Digite a data do seu compromisso: ");
        String data2 = scan.nextLine();
        System.out.println("Digite o horário do seu compromisso: ");
        String hora2 = scan.nextLine();

        System.out.println(pessoal.exibeCompromissoPessoal(compromissop1, data1, hora1));
        System.out.println(profissional.exibeCompromissoProfissional(compromissop2, data2, hora2));

    }


}
