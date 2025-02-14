public class Practical08{
  void displayPattern1(int size,int count){
    if(count>size){
      return;
    }
    System.out.println("*".repeat(count));
    displayPattern1(size,count+1);
    if(count==size){
      System.out.println("*".repeat(count+1));
    }
    System.out.println("*".repeat(count));
  }
  
  void displayPattern2(int size,int count){
    if(count>size){
      return;
    }
    System.out.print(" ".repeat(size-count+1));
    System.out.println("*".repeat(count));
    displayPattern2(size,count+1);
    if(count==size){
      System.out.println("+".repeat(count+1));
    }
    System.out.print(" ".repeat(size-count+1));
    System.out.println("/".repeat(count));
  }
  
  void displayPattern3(int size,int count){
    if(count>size){
      return;
    }
    System.out.print(" ".repeat(size-count));
    System.out.println("*".repeat(2*count-1));
    displayPattern3(size,count+1);
    System.out.print(" ".repeat(size-count));
    if(count!=size){
      System.out.println("*".repeat(2*count-1));
    }
    if(count==1){
      System.out.print((" ".repeat(size-1)+"+\n").repeat(2*size-1));
    }
  }
  
  public static void main(String[] args){
    Practical08 obj = new Practical08();
    int size=3;
    obj.displayPattern1(size,1);
    System.out.println();
    obj.displayPattern2(size,1);
    System.out.println();
    obj.displayPattern3(size,1);
  }
}
