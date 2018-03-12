package fpp.lab5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewJFrame extends JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        centerFrameOnDesktop(this);
        initComponents();
    }

    private void initComponents() {

        buttonsPanel = new JPanel();
        countLetterBtn = new JButton();
        reverseLettersBtn = new JButton();
        removeDuplicateBtn = new JButton();
        textfieldsPanel = new JPanel();
        inputText = new JTextField();
        outputText = new JTextField();
        inputLbl = new JLabel();
        outputLbl = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("String Utility");

        countLetterBtn.setText("Count Letters");
        countLetterBtn.addActionListener(new CountBtnListener());

        reverseLettersBtn.setText("Reverse Letters");
        reverseLettersBtn.addActionListener(new ReverseLettersListener());

        removeDuplicateBtn.setText("Remove Duplicate");
        removeDuplicateBtn.addActionListener(new RemoveDuplicateListener());

        GroupLayout jPanel1Layout = new GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(countLetterBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(reverseLettersBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeDuplicateBtn, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(countLetterBtn)
                                .addGap(18, 18, 18)
                                .addComponent(reverseLettersBtn)
                                .addGap(18, 18, 18)
                                .addComponent(removeDuplicateBtn)
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        inputLbl.setText("Input");

        outputLbl.setText("Output");

        GroupLayout jPanel2Layout = new GroupLayout(textfieldsPanel);
        textfieldsPanel.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(inputLbl)
                                        .addComponent(outputLbl)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(inputText, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                                .addComponent(outputText)))
                                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(inputLbl)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(outputLbl)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(34, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(buttonsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textfieldsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(textfieldsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }

    class CountBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            outputText.setText(String.valueOf(inputText.getText().length()));
        }
    }

    class ReverseLettersListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(inputText.getText());
            outputText.setText(stringBuilder.reverse().toString());
        }
    }

    class RemoveDuplicateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }


    private JButton countLetterBtn;
    private JLabel inputLbl;
    private JLabel outputLbl;
    private JPanel buttonsPanel;
    private JPanel textfieldsPanel;
    private JTextField inputText;
    private JTextField outputText;
    private JButton removeDuplicateBtn;
    private JButton reverseLettersBtn;

    public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
    }

}

