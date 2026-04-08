public class stringarray {
  public static void main(String[] args) {
      //declare astring array with initial size
      String[]schoolbag=new String[4];
      //add elements to the array
      schoolbag[0]="Books";
      schoolbag[1]="pens";
      schoolbag[2]="pencils";
      schoolbag[3]="notebooks";
      String[]schoolbag2={"Books","pens","pencils","notebooks"};
      int size=schoolbag2.length;
      System.out.print("The size of array is:"+size);
      for(int i=0;i<size;i++){
      System.out.print("Index["+i+"]="+ schoolbag2[i]);
      System.out.print("\n");
      }
  }
}
   
      
