import java.util.*;
import java.io.*;
import java.lang.Math;

class RomanToInteger{

  public static int value(char r){
    if(r=='I')
      return 1;
    if(r=='V')
      return 5;
    if(r=='X')
      return 10;
    if(r=='L')
      return 50;
    if(r=='C')
      return 100;
    if(r=='D')
      return 500;
    if(r=='D')
      return 1000;
    return -1;
  }

  public static int romanToInteger(String str){
    int total = 0;

    for(int i = 0; i < str.length(); i++){
      int s1 = value(str.charAt(i));

      if(i + 1 < str.length()){
        int s2 = value(str.charAt(i+1));
        
        //comparing the current character from its right character   
        if(s1 >= s2){
          total = total + s1; 
        }
        else{
          total = total - s1;
        }
        
      }
      else{
        total = total + s1;
      }
      
    }
    return total;
  }
    public static void main(String[] args) {

      RomanToInteger ob = new RomanToInteger();  
    String romanStr= "L";   
    System.out.println("The corresponding Integer value is: "+ob.romanToInteger(romanStr));
    }
}
