package appwhatsapp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

public class AppWhatsapp implements Serializable {

    public static void main(String[] args) {
        JFrameWhatsapp wpp = new JFrameWhatsapp();
        wpp.setIconImage(new ImageIcon("wpp.png").getImage());
        wpp.setLocationRelativeTo(null);
        wpp.setResizable(false);
        wpp.setVisible(true);
    }

    public String dataEHora() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM" + "-" + "HH:mm");
        String dataEHora = now.format(formatter);
        return (dataEHora);
    }
}
