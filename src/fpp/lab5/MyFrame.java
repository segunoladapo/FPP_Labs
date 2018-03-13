package fpp.lab5;


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

    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel textPanelInput;
    private JPanel textPanelOutput;
    private JTextField textInput;
    private JLabel labelInput;
    private JTextField textOutput;
    private JLabel labelOutput;
    private JButton buttonCount;
    private JButton buttonReverse;
    private JButton buttonRemove;
    public static enum Operation{COUNT, REVERSE, REMOVE};

    public MyFrame() {
        initializeWindow();
        JPanel mainPanel = new JPanel();
        defineRightColumnPanel();
        defineLeftColumnPanel();

        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(leftPanel, new FlowLayout(FlowLayout.CENTER, 5, 0));
        // mainPanel.add(middlePanel, BorderLayout.CENTER);
        mainPanel.add(rightPanel, new FlowLayout(FlowLayout.CENTER, 5, 0));
        getContentPane().add(mainPanel);
    }

    private void defineLeftColumnPanel() {

        leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout(10, 10));

        buttonCount = new JButton("Count Letters");
        buttonCount.addActionListener(new MyButtonListener(textInput, textOutput, Operation.COUNT));
        leftPanel.add(buttonCount, BorderLayout.NORTH);

        buttonReverse = new JButton("Remove Duplicates");
        buttonReverse.addActionListener(new MyButtonListener(textInput, textOutput, Operation.REMOVE));
        leftPanel.add(buttonReverse, BorderLayout.CENTER);

        buttonRemove = new JButton("Reverse Letters");
        buttonRemove.addActionListener(new MyButtonListener(textInput, textOutput, Operation.REVERSE));
        leftPanel.add(buttonRemove, BorderLayout.SOUTH);
    }

    private void defineRightColumnPanel() {
        rightPanel = new JPanel();
        defineTextPanelLayout();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(textPanelInput, BorderLayout.NORTH);
        rightPanel.add(textPanelOutput, BorderLayout.CENTER);

    }

    private void defineTextPanelLayout() {

        JPanel toptextInput = new JPanel();
        JPanel bottomtextInput = new JPanel();
        toptextInput.setLayout(new BorderLayout());
        bottomtextInput.setLayout(new BorderLayout());

        labelInput = new JLabel("Input");
        labelInput.setFont(makeSmallFont(labelInput.getFont()));
        textInput = new JTextField(10);
        toptextInput.add(labelInput, BorderLayout.NORTH);
        textInput.setText("EVEREST PEAK");
        bottomtextInput.add(textInput, BorderLayout.CENTER);

        textPanelInput = new JPanel();
        textPanelInput.setLayout(new BorderLayout());
        textPanelInput.add(toptextInput, BorderLayout.NORTH);
        textPanelInput.add(bottomtextInput, BorderLayout.CENTER);

        // Street
        JPanel toptextOutput = new JPanel();
        JPanel bottomtextOutput = new JPanel();
        toptextOutput.setLayout(new BorderLayout());
        bottomtextOutput.setLayout(new BorderLayout());

        labelOutput = new JLabel("Output");
        labelOutput.setFont(makeSmallFont(labelOutput.getFont()));
        textOutput = new JTextField(10);
        toptextOutput.add(labelOutput, BorderLayout.NORTH);
        bottomtextOutput.add(textOutput, BorderLayout.CENTER);

        textPanelOutput = new JPanel();
        textPanelOutput.setLayout(new BorderLayout());
        textPanelOutput.add(toptextOutput, BorderLayout.NORTH);
        textPanelOutput.add(bottomtextOutput, BorderLayout.CENTER);

    }

    private void initializeWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("String Utility");
        setSize(320, 160);
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
