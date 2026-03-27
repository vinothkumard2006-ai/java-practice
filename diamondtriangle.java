public class diamondtriangle {
    public static void main(String[]args){
    int n=9;
    int mid=n/2+1;
		int space =mid;
		int star=1;
		for(int i = 1;i<=n;i++){
		
			for(int j = 1;j<=space;j++)
			{
				System.out.print("        ");
                
			}
			for(int k = 1;k<=star;k++)
			{
				System.out.print(" tamilan");
			}
            
System.out.println();
 if(i<mid) {
   space--;
   star=star+2;}
 if(i>=mid){
    space++;
    star=star-2;
}}

}
	}





