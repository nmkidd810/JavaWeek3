
public class HomeworkAssignment {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
 /**
  * 1.  Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
  * 
//a.  Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
//
//b.  Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//c.  Use a loop to iterate through the array and calculate the average age. Print the result to the console.
//2.  Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

//a.  Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//b.  Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

//3.  How do you access the last element of any array?
//4.  How do you access the first element of any array?
//5.  Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
//6.  Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
//7.  Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
  *    
  */
// 1.  Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.   
    int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    
//a.  Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
    
    System.out.println(ages [ages.length-1] - ages[0]);
        
  //b.  Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
    int [] aged = {3, 9, 23, 64, 2, 8, 28, 93, 102};
    
    System.out.println(aged [aged.length-1] - aged[0]);
    
  //c.  Use a loop to iterate through the array and calculate the average age. Print the result to the console.
    
    int ave = 0;  
      for(int i = 0; i <= ages.length -1; i++ ) {
        ave += ages[i];
    }System.out.println(ave/ages.length);

  //2.  Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

//a.  Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
    
  int sumOfLetters = 0;
  for(String name: names) {
    sumOfLetters += name.length();
   }System.out.println("Sum of Letters: " +sumOfLetters); 
    
//b.  Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.    
   
   StringBuffer sb = new StringBuffer();
   for(int i = 0; i < names.length;i++) {
     sb.append(names[i]); 
   }
   String str = sb.toString();
   System.out.println(str + " ");
  
 //3.  How do you access the last element of any array?
   
   System.out.println(names[names.length -1]);
   
 //4.  How do you access the first element of any array?
   
   System.out.println(names[0]);
   
 //5.  Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
     
   int []nameLengths = new int[names.length];
     for(int i = 0 ; i < names.length; i++) {
          String temp = names[i];
          nameLengths[i] = temp.length();
     } 
     
   
 //6.  Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
   int sumLength = calculatesum(nameLengths);
      
       System.out.println("Sum of nameLengths Array is " + sumLength);

//7.  Write a method that takes a String, word, and an int, n, as arguments and returns the word 
//    concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect 
//    the method to return “HelloHelloHello”).   
       
       String conc1=Concatenate("Hello",3);
       System.out.println(conc1);
//8.  Write a method that takes two Strings, firstName and lastName, and returns a full name 
//    (the full name should be the first and the last name as a String separated by a space).  
//    (7,8,9 10, 11, 12, 13) all follow this example)
  
 //   Eight("Eddie", "Mylan");
    System.out.println(Eight("Eddie", "Mylan")); 
 
//9. Write a method that takes an array of int and returns true if the sum of all the ints in 
//    the array is greater than 100.
    
    System.out.println("Sum Greater than 100: " + sumGreaterThan100(ages)); 
    
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
     double [] elements = {34.5,20.0,50.1,34.3};
     
     System.out.println("Average: " + Average(elements));
    
//11. Write a method that takes two arrays of double and returns true if the average of the elements 
//    in the first array is greater than the average of the elements in the second array.
     double [] elementsII = {16.5,20.0,100.1,39.3};
     System.out.println("Compare element array to elementII array: " + compareElementsAve(elements, elementsII));
     
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//    and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    
     System.out.println(willBuyDrink(true, 12.50) );
    
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
  //  Should my cat go outside
    String catName = "Tuxedo";
    double temp = 15;
    
    if (shouldCatGoOutside(0) < 100) {
      System.out.println("Yes " + catName + "can go outside as the tempature is " + shouldCatGoOutside(temp));
    }else 
      System.out.println("No "+ catName + " should not go out as the tempature is: "+shouldCatGoOutside(temp));
    
  }// end of main

  private static double shouldCatGoOutside (double tempature) {
    double temp = tempature;
       
       
       return (tempature);
         
       }
  
  private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    
    return isHotOutside && moneyInPocket > 10.50;
    
  }
  
  private static boolean compareElementsAve(double[]ave, double[]ave2) {
    return Average(ave) > Average(ave2);
  }
  
  private static double Average(double[] ave) {
    double sum = 0;
    for(double number: ave) {
    sum += number;
    }
   return sum/ave.length;
  }
  private static boolean sumGreaterThan100(int[] ints) {
    int sum = 0;
    for(int number: ints) {
      sum += number;
    } 
    return sum > 100;
  }

  private static String Concatenate(String string, int n) {
    // TODO Auto-generated method stub
    String answer="";
    n = 3;
    
    for(int i=0;i< n ;i++)
    {
            answer+= "Hello";
    }
    // return the answer String
    return answer;
    }


  private static int calculatesum(int[] nameLengths) {
    // TODO Auto-generated method stub
    int sum = 0;
    for(int i = 0;i < nameLengths.length; i++){
            sum += nameLengths[i];
    }
      return sum;
    
  }



  public static String Eight (String firstName, String lastName) {
    String fullName =(firstName + " " + lastName);
    return fullName;
        
    
  }
 
}
