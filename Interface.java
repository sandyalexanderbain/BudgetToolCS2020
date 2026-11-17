import java.util.*;

public class Interface {
  private static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    boolean continueMainMenu = true;
    
    while (continueMainMenu){
      String savedAction = mainMenu();

      if (savedAction.equals("exit")){
        continueMainMenu = false;
      }
    }
    
  }


  public static String mainMenu(){
    String printString = "";
    System.out.print(printString + "\n\tType the corresponding letter in: ");
    String choice = reader.nextLine().toLowerCase();
    System.out.print("\n");
    return choice;
  }
}
