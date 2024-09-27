// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {

        var password = "PASS6word"; 
        
        String[] inputArray = password.split("");
        //new String[]{"P","A","S","S","6","w","o","r","d"};
        
        System.out.println(inputArray);
        
        checkPassword(inputArray, "4dro6");
    }
    
    public static String checkPassword(String[] inputArray, String criteria) {
            int numUppercase = Character.getNumericValue(criteria.charAt(0));
            String lastCharReversed = new StringBuilder(criteria.substring(1, 4)).reverse().toString();
            int sumOfDigits = Character.getNumericValue(criteria.charAt(criteria.length() - 1));
            

            int uppercaseCount = 0;
            int sumDigits = 0;
                
            // Iterating through the input array to check each string
            for (int i = 0; i < inputArray.length; ++i) {
                var character = inputArray[i].charAt(0);
                if(Character.isUpperCase(character)){
                    uppercaseCount++;
                }
                
                if(Character.isDigit(character)){
                    sumDigits += Character.getNumericValue(character); 
                }
            }
            
            System.out.println(uppercaseCount);
            System.out.println(sumDigits);
            
            String str = String.join("", inputArray);
            //System.out.println(str.contains(lastCharReversed));
            
            if(sumOfDigits == sumDigits && uppercaseCount == numUppercase && str.contains(lastCharReversed)){
                System.out.println("true");
                return "";
            }

           System.out.println("false");
           // Return false if no string meets the criteria
          return "";
        }
}
