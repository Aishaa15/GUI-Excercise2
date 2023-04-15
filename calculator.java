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

        //add action listener to the add buttons
        addButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //decalare variables 
                double num1, num2, result;
                try {
                        // Get the numbers from the text fields
                        num1 = Double.parseDouble(num1Field.getText());
                        num2 = Double.parseDouble(num2Field.getText());
                    } 
                    
                    catch (NumberFormatException ex) 
                    {
                        resultLabel.setText("Error: Invalid input");
                        return;
                    }
                
                // Perform the calculation based on the button clicked
                if (e.getSource() == addButton) 
                {
                    resultLabel.setText("Result: " + (num1 + num2));
                } 
            }
        });
        
        //add action listener to the add buttons
        subtractButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //decalare variables 
                double num1, num2, result;
                try {
                        // Get the numbers from the text fields
                        num1 = Double.parseDouble(num1Field.getText());
                        num2 = Double.parseDouble(num2Field.getText());
                    } 
                    
                    catch (NumberFormatException ex) 
                    {
                        resultLabel.setText("Error: Invalid input");
                        return;
                    }
                
                // Perform the calculation based on the button clicked
                if (e.getSource() == subtractButton) 
                {
                    resultLabel.setText("Result: " + (num1 - num2));
                } 
            }
        });
        
        //add action listener to the add buttons
        multiplyButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //decalare variables 
                double num1, num2, result;
                try {
                        // Get the numbers from the text fields
                        num1 = Double.parseDouble(num1Field.getText());
                        num2 = Double.parseDouble(num2Field.getText());
                    } 
                    
                    catch (NumberFormatException ex) 
                    {
                        resultLabel.setText("Error: Invalid input");
                        return;
                    }
                
                // Perform the calculation based on the button clicked
                if (e.getSource() == multiplyButton) 
                {
                    resultLabel.setText("Result: " + (num1 * num2));
                } 
            }
        });
        
        //add action listener to the add buttons
        divideButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //decalare variables 
                double num1, num2, result;
                try {
                        // Get the numbers from the text fields
                        num1 = Double.parseDouble(num1Field.getText());
                        num2 = Double.parseDouble(num2Field.getText());
                    } 
                    
                    catch (NumberFormatException ex) 
                    {
                        resultLabel.setText("Error: Invalid input");
                        return;
                    }
                
                // Perform the calculation based on the button clicked
                if (e.getSource() == divideButton) 
                {
                    resultLabel.setText("Result: " + (num1 / num2));
                } 
            }
        });
        
        
        // set window size and make it visible
        setSize(500, 500);
        setVisible(true);

    }

    
}
