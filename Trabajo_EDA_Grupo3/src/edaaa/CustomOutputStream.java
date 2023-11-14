/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edaaa;

import java.io.OutputStream;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class CustomOutputStream extends OutputStream {
    private JTextArea textArea;

    public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) {
        // Redirige los datos al JTextArea
        SwingUtilities.invokeLater(() -> textArea.append(String.valueOf((char) b)));
        // Autoscroll para ver siempre la última línea
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}