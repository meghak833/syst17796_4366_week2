
package List;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] s=new Student[2];
        Scanner scan=new Scanner(System.in);
        
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Student();
            System.out.println("Enter id: ");
            s[i].setId(scan.nextInt());
            System.out.println("Enter name: ");
            s[i].setName(scan.next());
      
        }
        
        
        
        
        
        
        
    }

}
