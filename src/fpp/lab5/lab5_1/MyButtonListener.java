package fpp.lab5.lab5_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MyButtonListener implements ActionListener {
    String text;
    public MyButtonListener(JTextField name, JTextField street, JTextField city, JTextField state, JTextField zip) {
        this.text = name.getText() + "\n" + street.getText() + "\n"
                + city.getText() + ", " + state.getText() + " " + zip.getText();
    }
    public void actionPerformed(ActionEvent evt){
        System.out.println(this.text);
    }

}
