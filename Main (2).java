import java.io.*;

//import class Cryptography.java;

public class Main{

public static void main(String[] args) {
    Cryptography crypto = new Cryptography();
    String value = "";
    String encryptedValue = new String();
    String decryptedValue = new String();
    boolean intFlag = true;
    boolean sizeFlag = true;
   
    BufferedReader userinput = new BufferedReader(new InputStreamReader(System.
        in), 1);

    try {
      System.out.println(
          "\nEnter a four digit Integer value to Mystify. (E to Exit)");
      value = userinput.readLine();
      value = value.trim();
    }
    catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    while ( (value.equals("E") || value.equals("e")) == false) {
      intFlag = crypto.isInteger(value);
      if (intFlag == true) {
        sizeFlag = crypto.correctSize(value);
        if (sizeFlag == true){ 
           encryptedValue = crypto.encrypt(value);
           System.out.println("\n"+value+" encrypted to "+encryptedValue);
           decryptedValue = crypto.decrypt(encryptedValue);
           System.out.println("\n"+encryptedValue+" decrypted to "+decryptedValue);
        }
        else {
        System.out.println("User error: Please use 4 digits");
      }
      }
      else {
        System.out.println("User error: Number only.");
      }

      try {
        encryptedValue = "";
        decryptedValue = "";
        System.out.println(
            "\nEnter a four digit number to Encrypt. (E to Exit)");
        value = userinput.readLine();
        value = value.trim();
      }
      catch (IOException ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
}


