
	
	public class Practical07{
	String printP(int i,int size){
	String strp = "";
			for(int j=0;j<5+size;j++){
				if(i==0 || j==0 || i==(7+size)/2 || (j==(size+5-1) && i<=(7+size)/2)){
					strp += "* ";
					}
				else{
					strp += "  ";
					}
				}
				strp += "  ";
				return strp;
			}
		
		String printR(int i,int size,int count){
		String strr = "";
			for(int j=0;j<5+size;j++){
				if(i==0 || j==0 || i==(7+size)/2 || (j==5+size-1 && i<=(7+size)/2)){
					strr+="* ";
					}
        else if(j==5+size-1 && i>(7+size)/2){
            strr+="";
          }
					
				else{
					strr+="  ";
					}
					if(i>(7+size)/2 && (i+j)==count){
					    strr+="* ";
					  }
				}
				strr+="  ";
				return strr;
			}
	
		String printA(int i,int size){
		String stra="";
			for(int j=0;j<5+size;j++){
				if(i==0 || j==0 || i==(7+size)/2 || j==5+size-1 ){
					stra+="* ";
					}
				else{
					stra+="  ";
					}
				}
				stra+="  ";
				return stra;
			}
				
		String printT(int i,int size){
	  String strt = "";
			for(int j=0;j<5+size;j++){
				if(i==0 || j==(5+size)/2){
					strt+="* ";
					}
				else{
					strt+="  ";
					}
				}
				strt+="  ";
				return strt;
			}
				
		String printI(int i,int size){
		String stri = "";
			for(int j=0;j<5+size;j++){
				if(i==0 || j==(5+size)/2 || i==(7+size)){
					stri+="* ";
					}
				else{
					stri+="  ";
					}
				}
				stri+="  ";
				return stri;
		}
		
		String printK(int i,int size,int count1,int count2){
		String strk="";
			for(int j=0;j<size+5;j++){
				if(j==0){
					strk+="* ";
					}
				else{
					strk+="  ";
					}
					if(i>=(size+7)/2 && (i+j)==count1){
					    strk+="* ";
					  }
					  if(i<(size+7)/2 && (j-i)==count2){
					    strk+="* ";
					  }
				}
				strk+="  ";
				return strk;
			}
		
	String displayName(String sizeIs){
	int size = Integer.parseInt(sizeIs);
	  String ans="";
	  int count1=size+5-2;
	  int count2=size+5-2;
	  int count3=size+5-2;
			for(int i=0;i<=7+size;i++){
			  ans+=printP(i,size);
			  ans+=printR(i,size,count1);
			  ans+=printA(i,size);
			  ans+=printT(i,size);
			  ans+=printI(i,size);
			  ans+=printK(i,size,count2,count3);
			  if(i>=(size+7)/2){
			    count1+=2;
			    count2+=2;
			  }
			  if(i<(size+7)/2){
			    count3-=2;
			  }
			  ans+="\n";
		  }
		  return ans;
		  }
		  
		
	}
