
package graficas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Eventos_de_Teclado implements KeyListener {
    
    JPanel panel;
    JLabel label;
    
    public Eventos_de_Teclado(JPanel panel, JLabel label)
    {
        this.panel=panel;
        this.label=label;
    }
    @Override
    public void keyTyped(KeyEvent e) 
    {
       //int codigo=e.getKeyCode();
        char letra=e.getKeyChar();
        System.out.println(letra);
        if(letra=='a')
        {
            JOptionPane.showMessageDialog(null, "se presionó la tecla a mínuscula");
        }
        if(letra=='t')
        {
            this.label.setText("se presionó la tecla t minúscula");
            //this.label.setBounds(10,0,10,10);
            int opcion=JOptionPane.showConfirmDialog(null, "SI=Rojo\nNO=azul\nCancelar=amarillo");
            switch(opcion)
            {
                case 0:
                    this.panel.setBackground(Color.red);
                break;
                case 1:
                    this.panel.setBackground(Color.blue);
                break;
                case 2:
                    this.panel.setBackground(Color.yellow);
                break;
            }
            
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
         
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
