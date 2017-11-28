package appwhatsapp;

public class nenhumaMensagemException extends Exception {

    private String palavra;

    public nenhumaMensagemException() {
    }

    public nenhumaMensagemException(String msg) {
        super(msg);
        this.palavra = msg;
    }

    @Override
    public String toString() {
        return "Não há nenhuma mensagem com \"" + palavra + "\"";
    }
}
