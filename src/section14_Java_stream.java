import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class section14_Java_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
//		 WebDriver driver =new ChromeDriver();
          ArrayList<String> as=new ArrayList<String> ();
          as.add("Nisha");
          as.add("Rajat");
          as.add("Farha");
          as.add("Husband");
          as.add("Nayab");
          as.add("Naira");
//           StreamConverter(as);
//          StreamConverter();}

//          int count=0;
//          for (String iterate:as) {
//        	  if(iterate.startsWith("N")) {
//        		  count++;
//        	  };
//
//          }
//		  System.out.println("the arraylis count consists of N is:" + count);

          
//
//public static void StreamConverter(ArrayList as) {
//	long res=as.stream().filter(s->((String) s).startsWith("N")).count();
//	
//
//	System.out.println(res);
//    }


public static void StreamConverter() {
	
    long RESULT=Stream.of("Nisha","NEHA","FARHA","RAJAT").filter( s->s.startsWith("N")).count();
    System.out.println(RESULT);
    
    

    }


   public static void SortedList() {
	   as.stream().filter
	   
   }

          

	
