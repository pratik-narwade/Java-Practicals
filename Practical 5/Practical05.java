import java.util.*;
public class Practical05{
  int factorial1(int num){
    if(num<2){
      return 1;
    }
    else{
      int fact = 2;
      for(;num>2;){
        fact*=num--;
      }
      return fact;
    }
  }
  
  int factorial2(int num){
  if(num<2){
    return 1;
    }
  else{
    int fact = 2;
    while(num>2){
      fact*=num--;
      }
    return fact;
    }
  }
  
  int factorial3(int num){
  if(num<2){
    return 1;
  }
  else{
    return num*factorial3(num-1);
    }
  }
  
  int getSum(int [] numbers){
    if(numbers.length == 0){
      return 0;
    }
    int sum = numbers[numbers.length-1];
    int [] arr1 = Arrays.copyOfRange(numbers , 0 , numbers.length-1);
    return sum+getSum(arr1);
  }     
 }