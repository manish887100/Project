package pack;

import java.util.Scanner;

public class password_validator {
     public static void main(String[] args) {
    	 Scanner in=new Scanner(System.in);
 		System.out.println("Must have at least one numeric character"+"\n"
 				+"Must have at least one lowercase character"+"\n"
 				+"Must have Enter First Letter uppercase character"+"\n"
 				+"Must have at least one special symbol among @#$%"+"\n"
 				+"Password length should be between 8 and 20");
 		System.out.println("Enter your password!");
 		String str=in.next();
 		char ch[]=str.toCharArray();
 		int small=0;
 		int special=0;
 		int numeric=0;
        String numbers = "(.*[0-9].*)";

 		if(ch.length>=8 && ch.length<=20) {
 			if(ch[0]>='A' && ch[0]<='Z'){
 				
 			//loop for all password
 				
 				for(int i=1; i<ch.length; i++)
 				{
 					if(ch[i]>='a' && ch[i]<='z') {
 						
 						small++;
 					}	
 				}
 				if(small>0)
 				{
 					for(int j=1; j<ch.length; j++)
 					{
 						if(ch[j]=='@'|| ch[j]=='#'||ch[j]=='$'||ch[j]=='&') {
 							
 						   special++;
 							
 						}	
 					}
 					if(special>0)
 					{
 						for(int k=1; k<ch.length; k++)
 						{
 							if(!str.matches(numbers )) {
 								
 							   numeric++;
 								
 							}	
 						}
 						if(numeric>0)
 						{
 							System.out.println("Your Password Not Valid! "+"please Enter Numeric Characters");
 						}
 						else
 						{
 							System.out.println("Password is Valid");
 						}
 					}
 					else
 					{
 						System.out.println("Your Password Not Valid! "+"please Enter special Characters");
 					}
 				}
 				else
 				{
 					System.out.println("Your Password Not Valid! "+"please Enter Small Characters");
 				}	
 			}
 		    else {
 				System.out.println("Your Password Not Valid! "+" you Can Enter First Letter Capital");	
 			}	
 		}
 		else{
 			System.out.println("Your Password is Not Valid! "+" You Can Enter Minimum 8 and Maximum 15 Character Password"); 
 		}	
		
		
	
	

}
}
