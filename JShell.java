// **********************************************************
// Assignment1:
// Student1:zhu zeng
// CDF user_name:c4zengzhu
// UT Student #:1001610241
// Author:zhu zeng
//
// Student2: Iftisum Zaman
// CDF user_name: c3zamani
// UT Student #:
// Author:Iftisum Zaman
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// I have also read the plagiarism section in the course info
// sheet of CSC 207 and understand the consequences.
// *********************************************************
package a1;

import java.util.Arrays;
import java.util.Scanner;
public class JShell {
  
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);    
    String input;
    JShell js=new JShell();


    while(true) {
      System.out.print("/# ");
      input = sc.nextLine();   
      // check whether inputs are white spaces
      while(input.trim().isEmpty()){ 
        System.out.print("/# ");        
        input = sc.nextLine();        
      }
      // separate command name and arguments
      String[] parts = input.split(" "); 
      String cn = parts[0];
      String[] arg = Arrays.copyOfRange(parts, 1,parts.length);
      // check the if both command name and arguments are valid
      if ( js.isValid(cn,arg)){
      // if the command is exit, then terminate the program
          if (cn.equals("exit")){
              System.exit(0);
          }
          // print the command name and arguments
         System.out.println(parts[0]);
          if(parts.length==1){ 
            System.out.print("\n");}
          if(parts.length > 1){
              for(int i=1;i<= parts.length-1;i++){
                  System.out.print(parts[i]+" ");   
              } System.out.print("\n");          
              }            
      }else{
        System.out.println("invalid command please try again");
        }      
    }
    
}

    public boolean isValid (String cn, String[] arg) { 

      if (cn.equals("exit") && arg.length == 0) {
          return true;
      } else if (cn.equals("ls") && arg.length == 0) {
          return true;
      } else if (cn.equals("pwd") && arg.length == 0) {
          return true;
      } else if (cn.equals("mkdir") && arg.length == 1) {
          return true;
      } else if (cn.equals("cd") && arg.length == 1) {
          return true;
      } else if (cn.equals("cat") && arg.length == 1) {
          return true;
      } else if (cn.equals("get") && arg.length == 1) {
          return true;
      } else if (cn.equals("mv") && arg.length == 2) {
          return true; 
      } else if (cn.equals("cp") && arg.length == 2) {
          return true;
      } else if (cn.equals("echo") && arg.length == 3 && arg[1].equals(">")) {
          return true;                                  
      } else if (cn.equals("echo") && arg.length == 3 && arg[1].equals(">>")) {
          return true;
      } else {
          return false;
      }
    }
    }
