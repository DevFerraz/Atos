package Heranca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Usuario user = new Usuario();

        System.out.println("Digite seu nome: ");
        user.setNome(scan.nextLine());

        System.out.println("Digite sua idade: ");
        user.setIdade(scan.nextLine());

        System.out.println("Digite seu telefone: ");
        user.setTelefone(scan.nextLine());

        System.out.println("Digite seu email: ");
        user.setEmail(scan.nextLine());

        System.out.println("Digite seu gênero: ");
        user.setGenero(scan.nextLine());

        System.out.println(user.usuarioPessoa());

        System.out.println("O usuário é, portanto, um animal, porém, quanto aos animais: " + user.metodoAndar());
        System.out.println("Também podemos afirmar quanto aos seres humanos: " + user.metodoFalar());
        System.out.println("O usuário é do sexo " + user.getGenero());
        System.out.println("De nome " + user.getNome());
        System.out.println("De " + user.getIdade() + " anos");
        System.out.println("Com telefone: " + user.getTelefone());
        System.out.println("Email: " + user.getEmail());



    }
}
