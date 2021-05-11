import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
       
        Scanner myObj = new Scanner(System.in); 
        System.out.print("Enter a string ");
        String s=myObj.nextLine();
        
        System.out.println();
        replacePi(s);
        
        
    }
    
    public static void replacePi (String s) {

        if(s.length()==0)
            return;
            
        if(s.length()==1){
            System.out.print(s.charAt(0));
            return;
        }
        
        if(s.charAt(0)=='p'&& s.charAt(1)=='i'){
            System.out.print(3.14);
            replacePi(s.substring(2));
        }else{
            System.out.print(s.charAt(0));
            replacePi(s.substring(1));
        }
    }
    
}

/*
Input

Enter a string 2 * pi + 3 * pi = 5 * pi

Output

2 * 3.14 + 3 * 3.14 = 5 * 3.14

*/

