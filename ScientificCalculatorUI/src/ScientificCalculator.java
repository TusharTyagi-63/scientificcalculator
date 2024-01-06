import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScientificCalculator extends JFrame implements ActionListener {

    // Create components
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[27];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, sqrtButton, powButton, logButton, sinButton, cosButton, tanButton;
    JButton sinhButton, coshButton, tanhButton, piButton, eButton;

    double num1, num2, result;
    char operator;

    // Constructor
    public ScientificCalculator() {
        // Set frame properties
        setTitle("Scientific Calculator");
        setSize(430, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create text field
        textField = new JTextField();
        textField.setBounds(30, 30, 350, 50);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setEditable(false);
        add(textField);

        // Initialize number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            numberButtons[i].addActionListener(this);
        }

        // Initialize function buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        sqrtButton = new JButton("sqrt");
        powButton = new JButton("^");
        logButton = new JButton("log");
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        sinhButton = new JButton("sinh");
        coshButton = new JButton("cosh");
        tanhButton = new JButton("tanh");
        piButton = new JButton("pie");
        eButton = new JButton("e");

        JButton[] functionButtons = {addButton, subButton, mulButton, divButton, decButton, equButton, delButton, clrButton,
                sqrtButton, powButton, logButton, sinButton, cosButton, tanButton, sinhButton, coshButton, tanhButton, piButton, eButton};

        for (JButton button : functionButtons) {
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this);
        }

        // Set button positions
        addButton.setBounds(30, 100, 80, 80);
        subButton.setBounds(120, 100, 80, 80);
        mulButton.setBounds(210, 100, 80, 80);
        divButton.setBounds(300, 100, 80, 80);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numberButtons[i * 3 + j + 1].setBounds(30 + j * 90, 190 + i * 90, 80, 80);
            }
        }

        numberButtons[0].setBounds(30, 370, 80, 80);
        decButton.setBounds(300, 640, 80, 80);
        equButton.setBounds(300, 370, 80, 80);

        delButton.setBounds(300, 190, 80, 80);
        clrButton.setBounds(300, 280, 80, 80);

        sqrtButton.setBounds(30, 460, 80, 80);
        powButton.setBounds(120, 460, 80, 80);
        logButton.setBounds(210, 460, 80, 80);
        sinButton.setBounds(300, 460, 80, 80);
        cosButton.setBounds(30, 550, 80, 80);
        tanButton.setBounds(120, 550, 80, 80);
        sinhButton.setBounds(210, 550, 80, 80);
        coshButton.setBounds(300, 550, 80, 80);
        tanhButton.setBounds(30, 640, 80, 80);
        piButton.setBounds(120, 640, 80, 80);
        eButton.setBounds(210, 640, 80, 80);

        // Add buttons to the frame
        for (int i = 0; i < 10; i++) {
            add(numberButtons[i]);
        }

        for (JButton button : functionButtons) {
            add(button);
        }

        // Set layout and visibility
        setLayout(null);
        setVisible(true);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        if (e.getSource() == decButton) {
            textField.setText(textField.getText() + ".");
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == sqrtButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sqrt(num1);
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == powButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '^';
            textField.setText("");
        }

        if (e.getSource() == logButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.log10(num1);
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == sinButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sin(Math.toRadians(num1));
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == cosButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.cos(Math.toRadians(num1));
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == tanButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.tan(Math.toRadians(num1));
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == sinhButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sinh(num1);
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == coshButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.cosh(num1);
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == tanhButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.tanh(num1);
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == piButton) {
            textField.setText(String.valueOf(Math.PI));
        }

        if (e.getSource() == eButton) {
            textField.setText(String.valueOf(Math.E));
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    break;
            }

            textField.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == clrButton) {
            textField.setText("");
        }

        if (e.getSource() == delButton) {
            String currentText = textField.getText();
            if (!currentText.isEmpty()) {
                textField.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        new ScientificCalculator();
    }
}