package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculater extends JFrame{
    private final JTextField jTextField;
    private char operation;

    public Calculater (){
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(50,50, 180, 300);

        JPanel jPanel = new JPanel();
        jTextField = new JTextField(14);
        jTextField.setEditable(false);
        jPanel.add(jTextField);
        JButton[] btn = new JButton[9];
        for (int i = 0; i < btn.length; i++){
            btn[i] = new JButton(String.valueOf(i+1));
            btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    action(e);
                }
            });
            jPanel.add(btn[i]);
        }
        JButton btnZero = new JButton("0");
        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnMult = new JButton("*");
        JButton btnDiv = new JButton("/");
        JButton btnResult = new JButton("=");
        JButton btnPoint = new JButton(".");
        JButton btnClear = new JButton("C");
        JButton btnBackSpace = new JButton("BS");
        JButton btnPercent = new JButton("%");

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actClearText(e);
            }
        });

        btnBackSpace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jTextField.getText().equals("") ) {
                    jTextField.setText(deleteChar(jTextField.getText()));
                }
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLastDigit(jTextField.getText() )) {
                    action(e);
                }
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLastDigit(jTextField.getText() )) {
                    action(e);
                }
            }
        });

        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLastDigit(jTextField.getText() )) {
                    action(e);
                }
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLastDigit(jTextField.getText() )) {
                    action(e);
                }
            }
        });

        btnPercent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLastDigit(jTextField.getText() )) {
                    action(e);
                }
            }
        });

        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });

        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculating(e);
            }
        });

        jPanel.add(btnZero);
        jPanel.add(btnPoint);
        jPanel.add(btnBackSpace);
        jPanel.add(btnPlus);
        jPanel.add(btnMinus);
        jPanel.add(btnMult);
        jPanel.add(btnDiv);
        jPanel.add(btnPercent);
        jPanel.add(btnResult);
        jPanel.add(btnClear);

        add(jPanel);
        setVisible(true);
        setResizable(false);
    }

    public void action(ActionEvent event){
        jTextField.setText(jTextField.getText() + event.getActionCommand());
    }

    public void actClearText(ActionEvent event){
        jTextField.setText("");
    }

    public void calculating(ActionEvent event){
        String text = jTextField.getText();
        String tmpText = "";
        double total = 0;
        double currentVal;
        boolean isFirstElm = true;
        operation = '0';

        for (char ss: text.toCharArray()) {
            if (ss == '+' || ss == '-' || ss == '/' || ss == '*' || ss == '%') {
                currentVal = Double.parseDouble(tmpText);
                if (isFirstElm) {
                    total = currentVal;
                } else {
                    total = getTotal(total, currentVal);
                }
                tmpText = "";
                isFirstElm = false;
                operation = ss;
            } else {
                tmpText += ss;
            }
        }
        if (tmpText.equals("")){
            tmpText = "0";
        }

        jTextField.setText(String.valueOf(getTotal(total, Double.parseDouble(tmpText))));
    }

    public   double getTotal(double totalVal, double curVal){
        double result = 0;
        if (operation == '+'){
            return totalVal += curVal;
        }
        if (operation == '-'){
            return totalVal -= curVal;
        }
        if (operation == '*'){
            return totalVal *= curVal;
        }
        if (operation == '%'){
            return totalVal /= 100;
        }
        if (operation == '/' && curVal != 0){
            return totalVal /= curVal;
        }else {
            return totalVal;
        }
    }

    public  String deleteChar(String text){
        int length = text.length()-1;
        char[] curText = text.toCharArray();
        char[] newText = new char[length];
        System.arraycopy(curText,0, newText, 0, length);
        return String.valueOf( newText);
    }

    public boolean isLastDigit(String text){
        char[] curText = text.toCharArray();
        if (curText[curText.length-1] != '+' && curText[curText.length-1] != '-' &&
                curText[curText.length-1] != '*' && curText[curText.length-1] != '/' &&
                curText[curText.length-1] != '%' && curText[curText.length-1] != '.'){
            return true;
        }else {
            return false;
        }
    }
}
