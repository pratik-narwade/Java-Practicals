

public class Practical04 {
    static int finalNo ;
    static String finalAns;
   
    static int toByte(int num){
        if(num>=0){
            int mul=num/128;
                if(mul%2==0){
                    return num%128;
                }
                else{
                    return num%128-128;
                }
            }
        else{
            int mul=num/128;
            if(mul%2==0){
                return num%128;
            }
            else{
                if(num%128==0){
                    return -128;
                }
                return num%128+128;
            }
        }
    }

    static int toShort(int num){
        if(num>=0){
          int mul=num/32768;
            if(mul%2==0){
              return num%32768;
            }
            else{
              return num%32768-32768;
              }
       }
        else{
          int mul=num/32768;
          if(mul%2==0){
            return num%32768;
          }
          else{
            if(num%32768==0){
              return -32768;
              }
              return num%32768+32768;
          }
        }
      }

      static int getNumber(int num,String type){
        String s1 = "byte";
        String s2 = "short";
        if("byte".equalsIgnoreCase(type)){
          return toByte(num);
          
        }
        else if("short".equalsIgnoreCase(type)){
        return toShort(num);
        
        }
        else{
        
          return -1; 
        }
      }

    static int binToDec(String s){
        int num=0;
        for(int i=2,j=s.length()-3; i<s.length() ; i++,j--){
            int power = (int)Math.pow(2,j);
            num = num + (s.codePointAt(i)-48) * power;
            }
            return num;
        }
      
    static int octToDec(String s){
        int num=0;
        for(int i=2,j=s.length()-3; i<s.length() ; i++,j--){
            int power = (int)Math.pow(8,j);
            num = num + (s.codePointAt(i)-48) * power;
            }
            return num;
        }
      
    static int hexToDec(String s){
        int num=0;
        for(int i=2,j=s.length()-3; i<s.length() ; i++,j--){
            int term =0;
            if(s.charAt(i) == 'a'){
            term=10;
            }
            else if(s.charAt(i) == 'b'){
            term=11;
            }
            else if(s.charAt(i) == 'c'){
                term=12;
            }
            else if(s.charAt(i) == 'd'){
                term=13;
            }
            else if(s.charAt(i) == 'e'){
                term=14;
            }
            else if(s.charAt(i) == 'f'){
                term=15;
            }
            else{
                term=s.codePointAt(i)-48;
            }
            int power = (int)Math.pow(16,j);
            num = num + term * power;
        }
        return num;
    }

    static int decToDec(String s){
        return Integer.parseInt(s, 10);
    }
      
    static String decToBin(int num){
     
        int[] nums = new int[100];
        int i=0,rem;
        while(num>0){
            rem=num%2;
            nums[i]=rem;
            num=num/2;
            i++;
        }
        int numIs=0;
        for(int j=i;j>=0;j--){
            numIs=numIs*10+nums[j];
        }
        String f = Integer.toString(numIs);
        String g = "B".concat(f);
        String m = "0".concat(g);
        return m;
    }

    static String decToOct(int num){
       
        int[] nums = new int[100];
        int i=0,rem;
        while(num>0){
          rem=num%8;
          nums[i]=rem;
          num=num/8;
          i++;
          }
          int numIs=0;
        for(int j=i;j>=0;j--){
        numIs=numIs*10+nums[j];
        }
        String f = Integer.toString(numIs);
         return f;
        }

    static String decToDecIs(int num){
        return Integer.toString(num);
    }

    static String decToHex(int num){
        char[] nums = new char[100];
        int i=0,rem;
        while(num>0){
            rem=num%16;
              
            char term;
            if(rem == 10){
                term='a';
            }
            else if(rem == 11){
                term='b';
            }
            else if(rem == 12){
                term='c';
            }
            else if(rem == 13){
                term='d';
            }
            else if(rem == 14){
                term='e';
            }
            else if(rem == 15){
                term='f';
            }
            else{
                //term=(char)rem;
                term=(char)(rem+'0');
            }    
            nums[i]=term;
            num=num/16;
            i++;
        }
        String numIs = Character.toString(nums[i-1]);
        for(int j=i-2;j>=0;j--){
            numIs=numIs.concat(Character.toString(nums[j]));
        }
        return numIs;
    }

    static String toXXString(String numIs ,String typeIs){
        String s = numIs.toLowerCase();
        if(s.charAt(0)=='0' && s.charAt(1)=='b'){
            finalNo = binToDec(s);
            }
           
        else if(s.charAt(0)=='0' && s.charAt(1)=='x'){
            finalNo = hexToDec(s);
            }

        else if(s.charAt(0)=='0' && s.charAt(1)=='h'){
            finalNo = hexToDec(s);
            }
            
        else if(s.charAt(0)=='0' && s.charAt(1)=='o'){
            finalNo = octToDec(s);
            }
            
        else if(s.charAt(0)=='0' && s.charAt(1)=='0' && s.charAt(0)!='0'){
            finalNo = octToDec(s);
            }
        else{
            finalNo = decToDec(s);
            }
            String news = typeIs.toLowerCase();
            if(news.equals("binary")){
                finalAns = decToBin(finalNo);
            }
            if(news.equals("hexadecimal")){
                finalAns = decToHex(finalNo);
            }
            if(news.equals("octal")){
                finalAns = decToOct(finalNo);
            }
            if(news.equals("decimal")){
                finalAns = decToDecIs(finalNo);
            }
            return finalAns;
        }
    }