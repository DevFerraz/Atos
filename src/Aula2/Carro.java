package Aula2;

import ClassLog.Log;

import java.io.IOException;
import java.util.logging.Level;

public class Carro {
    private String fabricante;
    private String modelo;
    Log meuLogger = new Log("Natan.txt");

    public Carro() throws IOException {
    }

    public String getFabricante() {
        this.fabricante = "";
        try{
            System.out.println("entrou no try");
            if (fabricante.isEmpty()) {
                System.out.println("entrou no if");
                throw new Exception("mensagem");
            }
            return fabricante;
        }catch (Exception exception){
            System.out.println("Entrou no catch");
            //meuLogger.logger.setLevel(Level.SEVERE);
            meuLogger.logger.warning("i");
            return "";
        }
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
