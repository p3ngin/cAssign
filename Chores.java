import java.util.*;
public class Chores
{  
  public static void main(String[] args){
      
      String[] listChores = {"clean kitchen.","clean the bathrooms.", "vacuum the downstairs.", "vacuum the upstairs.", "mow the grass.", "grocery shopping."};
      
      ArrayList<String>listChores1 = new ArrayList<String>();
      ArrayList<String>listChores2 = new ArrayList<String>();
      
      String assign1 = "S";
      String assign2 = "M";
      
      //Count amount of chores in list
      System.out.println("Total chores: " + listChores.length);
      Random random = new Random();
      
      //assign1 = listChores[random.nextInt(listChores.length)];
      
      System.out.println("");
      //Prints list of chores using for each and storing each chore ** Chore assignment
      for ( int j = 0; j < (listChores.length); j++) {
         if (j < (listChores.length)/2){
             
             assign1 = listChores[random.nextInt(listChores.length)];
             listChores1.add(assign1);
        }else{
            
            assign2 = listChores[random.nextInt(listChores.length)];
            listChores2.add(assign2);
        } 
       }
       
      //Printing new assignment Array1
      System.out.println("Steve's Chores: ");
      for ( String chore1 : listChores1){
            System.out.println(chore1);
      }
      
      System.out.println("");
      //Printing new assignment Array2
      System.out.println("Monica's Chores: ");
      for ( String chore2 : listChores2){
            System.out.println(chore2);
      }
      
    }   
}
