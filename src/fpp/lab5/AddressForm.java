package fpp.lab5;

import javax.swing.*;
import java.awt.*;

/**
 * Created by segun on 3/5/2018.
 */
public class AddressForm extends JFrame {
    public static int SCREEN_WIDTH = 640;
    public static int SCREEN_HEIGHT = 280;

    //Define Panels
    private JPanel mainPanel;
    private JPanel upperPanel;
    private JPanel middlePanel;
    private JPanel lowerPanel;

    //Define Texts
    private JLabel nameLabel;
    private JLabel streetLabel;
    private JLabel cityLabel;
    private JLabel stateLabel;
    private JLabel zipLabel;

    //Define Textfields
    private JTextField nameTxtField;
    private JTextField streetTxtField;
    private JTextField cityTxtField;
    private JTextField stateTxtField;
    private JTextField zipTxtField;

    //Define button
    private JButton submitButton;


    public AddressForm() {
        initializeWindow();
        defineMainPanel();
        getContentPane().add(mainPanel);
    }

    private void initializeWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        setSize(AddressForm.SCREEN_WIDTH, AddressForm.SCREEN_HEIGHT);
        AddressForm.centerFrameOnDesktop(this);

    }

    public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
    }

    private void defineMainPanel(){
        mainPanel = new JPanel();
        defineUpperPanel();
        mainPanel.add(upperPanel);
    }

    private void defineUpperPanel(){
        upperPanel = new JPanel();
        JPanel nameLabelPanel =  new JPanel();
        nameLabelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        nameLabel = new JLabel("Name");
        nameLabelPanel.add(nameLabel);
        JPanel streetLabelPanel = new JPanel();
        streetLabelPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        streetLabel = new JLabel("Street");
        streetLabelPanel.add(streetLabel);
        upperPanel.add(nameLabelPanel);
        upperPanel.add(streetLabelPanel);

    }

    public Container getContentPane() {
        return getRootPane().getContentPane();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            AddressForm userIo = new AddressForm();
            userIo.setVisible(true);
        });
        System.out.println("Hello...");
    }
}

