package Interfaces2;

public class Profissional extends Compromisso{
    public String exibeCompromissoProfissional(String compromisso, String data, String hora) {
        return ("Compromisso Profissional: " + compromisso + " agendado na data " + data + " às " + hora + " horas");
    }
}
