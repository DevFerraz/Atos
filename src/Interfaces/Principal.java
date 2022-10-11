package Interfaces;

import java.util.Scanner;

public class Principal extends Mensagem{
    public static void main(String[] args) {
        String a;
        Scanner scan = new Scanner(System.in);
        Principal p = new Principal();
        System.out.println("Digite uma mensagem para preservação do planeta: ");
        a = scan.nextLine();
        System.out.println(p.exibeMensagemA());
        System.out.println(p.exibeMensagemB(a));

    }
    @Override
    public String exibeMensagemA() {
        return "Cuide bem dos animais";
    }
    @Override
    public String exibeMensagemB(String a) {
        return a;
    }
}
