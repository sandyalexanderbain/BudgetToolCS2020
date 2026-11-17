import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Interface extends JPanel {
  private static Scanner reader = new Scanner(System.in);

  JFrame topLevelFrame; 
  GridBagConstraints layoutConstraints = new GridBagConstraints(); 
                                                                  
  private JTextField wagesTextField;
  private JTextField loansTextField;
  private JTextField rentTextField;
  private JTextField foodTextField;
                             
  // Initialise the UI.
  public Interface(JFrame frame) {
      topLevelFrame = frame; // keep track of top-level frame
      setLayout(new GridBagLayout());  // use GridBag layout
      initComponents();  // initalise components
  }

  // TODO: initComponents method and use "setHgap()" function for spacing between grid bag elements.
  
  private void initComponents() {
    JLabel incomeLabel = new JLabel("INCOME");
    addComponent(incomeLabel, 0, 0);

    JLabel wagesLabel = new JLabel("Wages");
    addComponent(wagesLabel, 1, 0);
    wagesTextField = new JTextField("", 10);
    wagesTextField.setHorizontalAlignment(JTextField.CENTER);
    addComponent(wagesTextField, 1, 1);

    JLabel loansLabel = new JLabel("Loans");
    addComponent(loansLabel, 2, 0);
    loansTextField = new JTextField("", 10);
    loansTextField.setHorizontalAlignment(JTextField.CENTER);
    addComponent(loansTextField, 2, 1);

    JLabel expenseLabel = new JLabel("EXPENSES");
    addComponent(expenseLabel, 0, 2);
    
    JLabel rentLabel = new JLabel("Rent");
    addComponent(rentLabel, 1, 2);
    rentTextField = new JTextField("", 10);
    rentTextField.setHorizontalAlignment(JTextField.CENTER);
    addComponent(rentTextField, 1, 3);

    JLabel foodLabel = new JLabel("Food");
    addComponent(foodLabel, 2, 2);
    foodTextField = new JTextField("", 10);
    foodTextField.setHorizontalAlignment(JTextField.CENTER);
    addComponent(foodTextField, 2, 3);

    // firstTextField = new JTextField("", 10);   // blank initially, with 10 columns
    // firstTextField.setHorizontalAlignment(JTextField.RIGHT) ;    // number is at right end of field
    // addComponent(firstTextField, 1, 1);   
    
    // initListeners();
  }

  // private void initListeners() {
  // }


  // Initialise the GUI.
  private static void createAndShowGUI() {
    //Create and set up the window.
    JFrame frame = new JFrame("Interface Initialisation.");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Create and set up the content pane.
    Interface newContentPane = new Interface(frame);
    newContentPane.setOpaque(true); //content panes must be opaque
    frame.setContentPane(newContentPane);

    //Display the window.
    frame.pack();
    frame.setVisible(true);
  }


  // add a component at specified row and column in UI.  (0,0) is top-left corner   (dont need to change this)
  private void addComponent(Component component, int gridrow, int gridcol) {
      layoutConstraints.fill = GridBagConstraints.HORIZONTAL; 
      layoutConstraints.gridx = gridcol;
      layoutConstraints.gridy = gridrow;
      add(component, layoutConstraints);
  }
  

  public static void main(String[] args) {
    // boolean continueMainMenu = true;
    
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI(); 
        }
    });

    // while (continueMainMenu){
    //   String savedAction = mainMenu();
    //
    //   if (savedAction.equals("exit")){
    //     continueMainMenu = false;
    //   }
    // }
    
  }


  public static String mainMenu(){
    String printString = "";
    System.out.print(printString + "\n\tType the corresponding letter in: ");
    String choice = reader.nextLine().toLowerCase();
    System.out.print("\n");
    return choice;
  }
}
