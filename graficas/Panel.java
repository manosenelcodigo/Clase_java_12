
package graficas;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private JLabel label;
    
    public Panel(JLabel label)
    {
        this.label=label;
        this.addLabel();
    }
    
    public void addLabel()
    {
        this.label.setBounds(50,00,100,100);
        this.label.setText("texto inicial del label");
        add(this.label);
    }
}
