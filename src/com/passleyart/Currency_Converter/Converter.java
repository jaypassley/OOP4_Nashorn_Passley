package com.passleyart.Currency_Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Converter extends Component {
    private JButton convertButton;
    private JButton clearButton;
    private JTextField inputTextField;
    private JComboBox currencyComboBox;
    private JTextField resultTextField;
    private JLabel currencyTypeLabel;
    private JLabel JMDAmountLabel;
    private JLabel inputLabel;
    private JLabel currencyConverterLabel;
    JPanel converterView;

    public Converter() {


        inputTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') ||
                        (c == KeyEvent.VK_BACK_SPACE) ||
                        (c == KeyEvent.VK_PERIOD) ||
                        (c == KeyEvent.VK_DELETE))) {
                    e.consume();

                }
            }

        });


        clearButton.addActionListener(new ClearButtonClicked());
        convertButton.addActionListener(new ConvertButtonClicked());

    }





    private class ClearButtonClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            inputTextField.setText("");
            resultTextField.setText("");
            currencyComboBox.setSelectedIndex(0);

        }
    }



    private class ConvertButtonClicked implements ActionListener {



        @Override
        public void actionPerformed(ActionEvent e) {

            String per = inputTextField.getText();
            if (per.isEmpty()){
                JOptionPane.showMessageDialog(
                        Converter.this,
                        "Input Field Cannot Be Blank!",
                        "No Input To Convert",
                        JOptionPane.ERROR_MESSAGE);
            }
            else

            if (currencyComboBox.getSelectedIndex() == 0) {

               resultTextField.setText(String.valueOf(inputTextField));
            }
            else
            if (currencyComboBox.getSelectedIndex() == 1) {

                resultTextField.setText("Canadian Dollar");
            }
            else
            if (currencyComboBox.getSelectedIndex() == 2) {

                resultTextField.setText("Euro Dollar");
            }

        }
    }


}
