package appwhatsapp;

import java.io.Serializable;

public class Mensagem implements Serializable {

    private String emissor, texto;
    private String status;
    private String data;
    private String hora;

    public Mensagem() {
        this.status = "Está sendo Enviada";
    }

    public Mensagem(String emissor, String texto, String data, String hora) {
        this.emissor = emissor;
        this.texto = texto;
        this.data = data;
        this.hora = hora;
        this.status = "Está sendo Enviada";
    }

    public String getEmissor() {
        return emissor;
    }

    public String getTexto() {
        return texto;
    }

    public String getStatus() {
        return status;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        status = "Enviado";
        return data + "-" + hora + "\n" + emissor + ":\n" + texto + "\n" + status + "\n";
    }
}
