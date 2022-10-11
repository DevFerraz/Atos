package Heranca;

public class Usuario extends Pessoa{
    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String usuarioPessoa(){
        return "O usuário é uma pessoa";
    }
}
