package Aula2;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalVendas {
    public static void main(String[] args) throws IOException {
        Carro carro1 = new Carro();
        Scanner leituraa = new Scanner(System.in);
        System.out.println("Digite a fabricante do veículo (Carro): ");
        carro1.setFabricante(leituraa.nextLine());
        Scanner leituraa2 = new Scanner(System.in);
        System.out.println("Digite o modelo do veículo: ");
        carro1.setModelo(leituraa2.nextLine());
        System.out.println("O veículo selecionado foi o de marca: "
                + carro1.getFabricante() + ". De modelo: "

                + carro1.getModelo());


       /* Moto moto1 = new Moto();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a fabricante do veículo (Moto): ");
        moto1.setMarca(leitura.nextLine());
        Scanner leitura2 = new Scanner(System.in);
        System.out.println("Digite o modelo do veículo: ");
        moto1.setModelo(leitura2.nextLine());
        Scanner leitura3 = new Scanner(System.in);
        System.out.println("Digite as cilindradas do veículo: ");
        moto1.setCilindradas(leitura3.nextLine());
        System.out.println("O veículo selecionado foi o de marca: " + moto1.getMarca() + ". De modelo: " + moto1.getModelo() + ". De cilindradas: " + moto1.getCilindradas());


        Moto moto2 = new Moto();
        Scanner leitura10 = new Scanner(System.in);
        System.out.println("Digite a fabricante do veículo (Moto): ");
        moto2.setMarca(leitura10.nextLine());
        Scanner leitura20 = new Scanner(System.in);
        System.out.println("Digite o modelo do veículo: ");
        moto2.setModelo(leitura20.nextLine());
        Scanner leitura30 = new Scanner(System.in);
        System.out.println("Digite as cilindradas do veículo: ");
        moto2.setCilindradas(leitura30.nextLine());
        System.out.println("O veículo selecionado foi o de marca: " + moto2.getMarca() + ". De modelo: " + moto2.getModelo() + ". De cilindradas: " + moto2.getCilindradas());*/


    }
}


