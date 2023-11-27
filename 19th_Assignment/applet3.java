import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;

public class applet3 extends Applet implements ActionListener {
    TextField num1Field, num2Field;
    Button calculateButton;
    Label resultLabel;
    public void init() {
        // Create text fields for input
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        // Create a button to trigger calculation
        calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);
        // Create a label to display the result
        resultLabel = new Label("Sum will appear here");
        // Add components to the applet
        add(new Label("Enter Number 1:"));
        add(num1Field);
        add(new Label("Enter Number 2:"));
        add(num2Field);
        add(calculateButton);
        add(resultLabel);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            // Get the numbers entered by the user
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            // Calculate the sum
            int sum = num1 + num2;
            // Display the result
            resultLabel.setText("Sum: " + sum);
        }
    }
}

/*
 * <applet code = "applet3.class" width = "400" height = "400" ></applet>
 */
