import org.testng.annotations.Test;

@Test
public class ReverseStringTest
{
  String input ="Hello World!";
  String reverse = new StringBuilder(input).reverse().toString();

@Test
  public void VerifyReverseString(){
  System.out.println(reverse);
}

}
