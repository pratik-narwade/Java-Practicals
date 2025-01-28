class Practical06{
  
void displayPattern1(int size){
    for(int line=1;line<2*size;line++){
    if(line<=size){
      for(int star=1;star<=2*size;star++){
          if(star>size-line && star<size+line){
            System.out.print("* ");
            }
          else{
            System.out.print("  ");
            }
          }
          }
          else{
          for(int star=1;star<2*size;star++){
            if(star>line-size && star<2*size-(line%size)){
              System.out.print("* ");
            }
          else{
              System.out.print("  ");
            }
          }
        }
        System.out.println("");
      }
   } 
   
   
void displayPattern2(int size){
   if(size%2==0){
    for(int line=1;line<2*size;line++){
    if(line<=size){
      for(int star=1;star<=2*size;star++){
          if(star>=size-line && star<=size+line){
              if((star+line)%2==0){
                System.out.print("  ");
              }
              else{
                System.out.print("* ");
              }
            }
          else{
              System.out.print("  ");
            }
          }
      }
            
      else{
          for(int star=1;star<2*size;star++){
            if(star>=line-size && star<=2*size-(line%size)){
              if((star+line)%2==0){
              System.out.print("  ");
            }
            else{
              System.out.print("* ");
            }
            }
          else{
              System.out.print("  ");
            }
          }
        }
        System.out.println("");
      }
      }
      else{
        for(int line=1;line<2*size;line++){
    if(line<=size){
      for(int star=1;star<=2*size;star++){
          if(star>size-line && star<size+line){
              if((star+line)%2==0){
                System.out.print("* ");
              }
              else{
                System.out.print("  ");
              }
            }
          else{
              System.out.print("  ");
            }
          }
      }
            
      else{
          for(int star=1;star<2*size;star++){
            if(star>line-size && star<2*size-(line%size)){
              if((star+line)%2==0){
              System.out.print("* ");
            }
            else{
              System.out.print("  ");
            }
            }
          else{
              System.out.print("  ");
            }
          }
        }
        System.out.println("");
      }
      }
   } 

   
   
   
   
void displayPattern3(int size){
    for(int line=1;line<=2*size;line++){
    if(line<=size){
      for(int star=1;star<=2*size;star++){
          if(star>size-line && star<size+line){
              if(star%2==0){
                System.out.print("+ ");
              }
              else{
                System.out.print("* ");
              }
            }
          else{
            System.out.print("  ");
            }
        }
    }
          else{
          for(int star=1;star<=2*size;star++){
            if(line==(2*size)){
              if(star%size==0 && star!=2*size && size%2!=0){
                System.out.print("+ ");
              }
              if(star%size==0 && star!=2*size && size%2==0){
                System.out.print("* ");
              }
              else{
                System.out.print("  ");
              }
            }
            else if(star>=line-size && star<=2*size-(line%size)){
              if(star%2==0){
                System.out.print("* ");
              }
              else{
                System.out.print("+ ");
              }
            }
          else{
              System.out.print("  ");
            }
          }
        }
        System.out.println("");
      }
   } 
   
   
   }
   
   
   
  
