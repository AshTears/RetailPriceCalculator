
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
        
        setSize(400, 300);
        
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
     * The buildPanel method adds the labels, text fields and a button to the
     * panel
     */
    private void buildPanel(){
        
        // Create labels
        wholesale = new JLabel("Wholesale price:");
        markup = new JLabel("Markup");
        retail = new JLabel("Retail price: ");
        
        // Create text fields
        wholesaleTxt = new JTextField();
        markupTxt = new JTextField();
        
        // Create the button and add action listener to the button
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(new CalcButtonListener());
        
        // Create the panel
        panel = new JPanel();
        
        // Add components to the panel
        panel.add(wholesale);
        panel.add(wholesaleTxt);
        panel.add(markup);
        panel.add(markupTxt);
        panel.add(calcButton);
        panel.add(retail);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
