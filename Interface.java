import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Interface extends JPanel {
  private static Scanner reader = new Scanner(System.in);

  JFrame topLevelFrame; 
  GridBagConstraints layoutConstraints = new GridBagConstraints(); 
                                                                  
  public Interface(JFrame frame) {
      topLevelFrame = frame; // keep track of top-level frame
      setLayout(new GridBagLayout());  // use GridBag layout
      // initComponents();  // initalise components
  }

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
