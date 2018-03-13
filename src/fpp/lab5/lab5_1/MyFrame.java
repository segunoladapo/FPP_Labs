package fpp.lab5.lab5_1;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This version of MyFrame supports a button listener but does not support an
 * error dialog. The listener is placed outside the class. It also illustrates
 * more creative use of layout managers to create a more interesting arrangement
 * of components.
 *
 */
public class MyFrame extends JFrame {

    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel bottomPanel;
    private JPanel textPanelName;
    private JPanel textPanelStreet;
    private JPanel textPanelCity;
    private JPanel textPanelState;
    private JPanel textPanelZip;
    private JTextField textName;
    private JLabel labelName;
    private JTextField textStreet;
    private JLabel labelStreet;
    private JTextField textCity;
    private JLabel labelCity;
    private JTextField textState;
    private JLabel labelState;
    private JTextField textZip;
    private JLabel labelZip;
    private JButton button;

    public MyFrame() {
        initializeWindow();
        JPanel mainPanel = new JPanel();
        defineTopPanel();
        defineMiddlePanel();
        defineBottomPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        getContentPane().add(mainPanel);
    }

    private void defineTopPanel() {
        topPanel = new JPanel();
        defineTextPanelNorth();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(textPanelName);
        topPanel.add(textPanelStreet);
        topPanel.add(textPanelCity);

    }

    private void defineMiddlePanel() {
        defineTextPanelCenter();
        middlePanel = new JPanel();
        middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        middlePanel.add(textPanelState);
        middlePanel.add(textPanelZip);

    }

    private void defineBottomPanel() {
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        button = new JButton("My Button");
        button.addActionListener(new MyButtonListener(textName, textStreet, textCity, textState, textZip));
        bottomPanel.add(button);
    }

    private void defineTextPanelNorth() {

        JPanel topTextName = new JPanel();
        JPanel bottomTextName = new JPanel();
        topTextName.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        bottomTextName.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

        labelName = new JLabel("Name");
        labelName.setFont(makeSmallFont(labelName.getFont()));
        textName = new JTextField(10);
        topTextName.add(labelName);
        textName.setText("Patrick Wu");
        bottomTextName.add(textName);

        textPanelName = new JPanel();
        textPanelName.setLayout(new BorderLayout());
        textPanelName.add(topTextName, BorderLayout.NORTH);
        textPanelName.add(bottomTextName, BorderLayout.CENTER);

        // Street
        JPanel topTextStreet = new JPanel();
        JPanel bottomTextStreet = new JPanel();
        topTextStreet.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        bottomTextStreet.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

        labelStreet = new JLabel("Street");
        labelStreet.setFont(makeSmallFont(labelStreet.getFont()));
        textStreet = new JTextField(10);
        textStreet.setText("Ocean drive 55");
        topTextStreet.add(labelStreet);
        bottomTextStreet.add(textStreet);

        textPanelStreet = new JPanel();
        textPanelStreet.setLayout(new BorderLayout());
        textPanelStreet.add(topTextStreet, BorderLayout.NORTH);
        textPanelStreet.add(bottomTextStreet, BorderLayout.CENTER);
        // City
        JPanel topText = new JPanel();
        JPanel bottomText = new JPanel();
        topText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        bottomText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

        labelCity = new JLabel("City");
        labelCity.setFont(makeSmallFont(labelCity.getFont()));
        textCity = new JTextField(10);
        textCity.setText("New York");
        topText.add(labelCity);
        bottomText.add(textCity);

        textPanelCity = new JPanel();
        textPanelCity.setLayout(new BorderLayout());
        textPanelCity.add(topText, BorderLayout.NORTH);
        textPanelCity.add(bottomText, BorderLayout.CENTER);

    }

    private void defineTextPanelCenter() {

        // State
        JPanel topTextState = new JPanel();
        JPanel bottomTextState = new JPanel();
        topTextState.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        bottomTextState.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

        labelState = new JLabel("State");
        labelState.setFont(makeSmallFont(labelState.getFont()));
        textState = new JTextField(10);
        textState.setText("NY");
        topTextState.add(labelState);
        bottomTextState.add(textState);

        textPanelState = new JPanel();
        textPanelState.setLayout(new BorderLayout());
        textPanelState.add(topTextState, BorderLayout.NORTH);
        textPanelState.add(bottomTextState, BorderLayout.CENTER);

        // Zip
        JPanel topTextZip = new JPanel();
        JPanel bottomTextZip = new JPanel();
        topTextZip.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        bottomTextZip.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

        labelZip = new JLabel("Zip");
        labelZip.setFont(makeSmallFont(labelZip.getFont()));
        textZip = new JTextField(10);
        textZip.setText("12555");
        topTextZip.add(labelZip);
        bottomTextZip.add(textZip);

        textPanelZip = new JPanel();
        textPanelZip.setLayout(new BorderLayout());
        textPanelZip.add(topTextZip, BorderLayout.NORTH);
        textPanelZip.add(bottomTextZip, BorderLayout.CENTER);

    }

    private void initializeWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Address Form");
        setSize(430, 160);
        handleWindowClosing();
        centerFrameOnDesktop(this);
        setResizable(false);
    }

    public static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
    }

    private void handleWindowClosing() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                dispose();
                // other clean-up
                System.exit(0);
            }
        });
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

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MyFrame mf = new MyFrame();
                mf.setVisible(true);
            }
        });
    }

    void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE); // could also be
        // INFORMATION_MESSAGE
    }

    private static final long serialVersionUID = 3618976789175941431L;
}