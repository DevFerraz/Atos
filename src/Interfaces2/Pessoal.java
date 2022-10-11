package Interfaces2;

public class Pessoal extends Compromisso{

    public String exibeCompromissoPessoal(String compromisso, String data, String hora) {
        return ("Compromisso Pessoal: " + compromisso + " agendado na data " + data + " às " + hora + " horas");
    }
}
