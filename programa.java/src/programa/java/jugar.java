import java.util.Scanner;

/**
 *
 * @author eugbon
 */
public class ProgramaJava {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("VAMOS A JUGAR");
                
        		Scanner scan=new Scanner(System.in);
                
        		float adivinar1 = 1+(int)(100 * Math.random());
        		
        		boolean jugar = true;
               
        		int adivinar = 0;
				
                while (jugar==true){
                    
                    System.out.print("Dime un numero del 1 al 10:");     
                    
                    int num=(int) scan.nextFloat();
                
					if(num ==adivinar1){
                        System.out.println("!Acertaste! :)");
                        }
					
                    if (num!=adivinar1){
                        System.out.println(num);}
                    else{
                        System.out.println("¡No! Era el "+adivinar1);
                    	}
                		}  
    }
}