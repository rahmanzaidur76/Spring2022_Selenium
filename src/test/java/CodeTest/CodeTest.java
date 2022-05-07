package CodeTest;

import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class CodeTest {
        /**
         * Ques-2:
         * Verify feelsLike-temp value is in between the low-temp value and high-temp value
         * Web: https://www.darksky.net/
         * points: 20
         */

        @Test
        public static void  compTemp() {
            MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
            By tempLocator = By.xpath("//div[@id ='title']//span[@class='currently']//span[@class='desc swap']//span[@class='summary-high-low']//span[@class='feels-like-text']");
            WebElement fellsLike = MyDriver.getDriver().findElement(tempLocator);
            String fellsLikeTemp =  fellsLike.getText();

            By tempLowLocator = By.xpath("//div[@id ='title']//span[@class='currently']//span[@class='desc swap']//span[@class='summary-high-low']//span[@class='low-temp-text']");
            WebElement lowTemp =  MyDriver.getDriver().findElement(tempLowLocator);
            String lowTemp2 = lowTemp.getText();

            By tempHighLocator = By.xpath("//div[@id ='title']//span[@class='currently']//span[@class='desc swap']//span[@class='summary-high-low']//span[@class='high-temp-text']");
            WebElement highTemp =   MyDriver.getDriver().findElement(tempHighLocator);
            String highTemp2 = highTemp.getText();


        }






        /**
         * Ques-1:
         * Create a method to return factorial value of input-int-value
         * points: 10
         */
        /*
         *
         * eg:
         * input -> 5
         * returned value -> (5*4*3*2*1) = 120
         *
         * input -> 1
         * returned value -> (1) = 1
         *
         * input -> 3
         * returned value -> (3*2*1) = 6
         *
         * input -> 10
         * returned value -> (10*9*8*7*6*5*4*3*2*1) =
        */

        public static int factorialOfNumber(int n){
            int res = 1, i;
            for (i = 2; i <= n; i++)
            res *= i;
            return res;
        }







        /**
         * Ques-3:
         * Create a method to return the common Strings values in two input-String-arrays
         * points: 30
         * Note: two input-String-arrays can be of same size or different size
         */
        /*
         *
         * eg:
         * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
         * returned value -> [happy, peace]
         *
         * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
         * returned value -> [abcde, koli]
         *
         */

        public static void FindCommonValues(String[] input1, String[] input2){
            Set<String> set = new HashSet<>();
            for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {
            if (input1[i] == input2[j]) {

            set.add(input1[i]);
            break;
            }
          }
            }
            for (String i : set) {
                System.out.print(i + " ");
            }
        }


        /**
         * Ques-4:
         * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
         * points: 40
         */
        /*
         *
         * eg:
         * 	input -> : {3, 5, 1, 4, 2, 7}
         * 	returned value : 6
         *
         * 	input -> : {3, 5, 1, 4, 2}
         * 	returned value : 6
         *
         * 	input -> {2, 5, -1, 0, 6}
         * 	returned value : 1
         *
         * 	input -> {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
         * 	returned value : 4
         *
         * 	input -> {-2, -5, -1, -10, -6}
         * 	returned value : 1
         *
         */

    /*  public static int missingSmallestPositiveInteger(int input[], int A){
    }

*/



}
