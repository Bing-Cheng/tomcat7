package cbAxis2Service;

public class Number {
	  public int SecretNumber(int lower, int upper) 
      { 
         int range = upper - lower;
          int randomInt = (int)(range * Math.random());
          int sNumber = lower + randomInt; 
          return sNumber; 
      } 
      public String checkNumber(int userNum, int SecretNum) 
      { 
          if (userNum == SecretNum) 
              return "correct"; 
          else if (userNum > SecretNum) 
              return "too big"; 
          else return "too small"; 
      } 

}
