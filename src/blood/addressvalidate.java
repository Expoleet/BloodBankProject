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
public class addressvalidate {
    
    public static boolean address(String address){
     
    boolean statusss=false;
    
    String address_pattren ="^[#.0-9a-zA-Z\\s,-]+$";
	
		Pattern pattern = Pattern.compile(address_pattren);
                Matcher match= pattern.matcher(address);
	 
          if(match.matches()) {
              statusss=true;
          }              
          else {
      statusss=false;
        }
          return statusss;
}
}
