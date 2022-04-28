package com.passleyart.Currency_Converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter {
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




        clearButton.addActionListener(new ClearButtonClicked());
        convertButton.addActionListener(new ConvertButtonClicked());

    }





    private class ClearButtonClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            resultTextField.setText("");

        }
    }


    private class ConvertButtonClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            resultTextField.setText("Passley Art");

        }
    }


}
