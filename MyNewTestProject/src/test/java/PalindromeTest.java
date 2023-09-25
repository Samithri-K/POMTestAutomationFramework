import java.util.Locale;

import org.testng.annotations.Test;


public class PalindromeTest
{

  @Test
 public void verifyPalindrome(){
   String input = "A man, a plan, a canal, Panama";
   boolean palindrome = isPalindrome(input);
   System.out.println(palindrome);
}


 public static boolean isPalindrome(String text) {
   text = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
   return text.equals(new StringBuilder(text).reverse().toString());

 }
}
