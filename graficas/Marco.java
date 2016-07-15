
package graficas;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Marco extends JFrame {
    
    private JLabel label;
    
    public Marco()
    {
        this.label=new JLabel();
    }
    public void addVentana()
    {
        setBounds(200,50,1024,768);
        setVisible(true);
        setTitle("Ventana de eventos de teclado");
        
        Panel panel=new Panel(this.label);
        add(panel);
        addKeyListener(new Eventos_de_Teclado(panel,this.label));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
