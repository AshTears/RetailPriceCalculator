
package retailpricecalculator;

import javax.swing.*;

/**
 *  This program allows users to enter the cost and markup of an item, then
 * displays the retail price.
 * @author Ashika Shallow
 */
public class RetailPriceCalculator extends JFrame{
    
    private JLabel wholesale;
    private JLabel markup;
    private JLabel retail;
    JTextField wholesaleTxt;
    JTextField markupTxt;
    JButton calcButton;
    JPanel panel;
    
    private double wholesalePrice;
    private double markupCost;
    
    /**
     * Constructor
     */
    public RetailPriceCalculator(){
        // Set window title
        setTitle("Retail Price Calculator");
        
        // Set close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Call the buildPanel method
        buildPanel();
        
        // Add panel to the frame
        add(panel);
        
        // Display the window
        setVisible(true);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
