public class array {
 public static void main(String[] args) {
 double[] mylist={1.4,2.3,3.7,8.1,4.0};
 //print all the array elements
 for(int i=0;i< mylist.length;i++){
    System.out.println(mylist[i]+" ");
 }
 //summing of all elements
 double total=0;
 for(int i=0;i< mylist.length;i++){
    total+=mylist[i];
 }
 System.out.print("Total is"+ total);     
 }   
}
