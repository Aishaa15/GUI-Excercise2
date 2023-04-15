import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame
{
    // declare GUI components
    private JTextField num1Field, num2Field;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    private JLabel resultLabel;
    
    //set constructor 
    public calculator()
    {
        // Create the components
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        resultLabel = new JLabel("Result: ");
        
        //add components to the window
        setLayout(new FlowLayout());
        add(new JLabel("Number 1: "));
        add(num1Field);
        add(new JLabel("Number 2: "));
        add(num2Field);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(resultLabel);

    }

    
}
