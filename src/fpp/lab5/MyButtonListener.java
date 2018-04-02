package fpp.lab5;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.swing.JTextField;


public class MyButtonListener implements ActionListener {
    String text;
    private JTextField textInput;
    private JTextField textOutput;
    private MyFrame.Operation op;

    public MyButtonListener(JTextField textInput, JTextField textOutput, MyFrame.Operation op) {
        this.textInput = textInput;
        this.textOutput = textOutput;
        this.op = op;
    }

    public void actionPerformed(ActionEvent evt) {

        switch (this.op) {
            case COUNT:
                this.textOutput.setText(String.valueOf(this.textInput.getText().toString().length()));
                break;
            case REVERSE:
                StringBuilder sb= new StringBuilder(this.textInput.getText().toString());
                this.textOutput.setText(sb.reverse().toString());
                break;
            case REMOVE:
                String stringWithoutDuplicates = Arrays.asList(this.textInput.getText().toString().split("")).stream().distinct().collect(Collectors.joining());
                this.textOutput.setText(stringWithoutDuplicates);
                break;
            default:
                break;
        }


        System.out.println(this.textInput.getText() + this.textInput.getClass().toString() + op.toString());
    }

}