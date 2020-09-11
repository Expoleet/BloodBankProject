/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Raman
 */
public class email_validation {
    public static boolean emailaildation(String email){
     
    boolean status=false;
    
    String email_pattren = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	
	

	
		Pattern pattern = Pattern.compile(email_pattren, Pattern.CASE_INSENSITIVE);
                Matcher match= pattern.matcher(email);
	 
          if(match.matches()) {
              status=true;
          }              
          else {
      status=false;
        }
          return status;
          
}
}  

