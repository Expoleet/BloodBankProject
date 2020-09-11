
package blood;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobile {
    public static boolean mobilevaildation(String mobile){
     
    boolean statuss=false;
    
    String mobile_pattren = "^([7-9]{1})([0-9]{9})$";
	
	

	
		Pattern pattern = Pattern.compile(mobile_pattren);
                Matcher match= pattern.matcher(mobile);
	 
          if(match.matches()) {
              statuss=true;
          }              
          else {
      statuss=false;
        }
          return statuss;
          
}
}  
    

