public class patternspyramid {
    public static void main(String[]args){
        int n=3;
        int space=0;
        int star=5;{
        for(int i=1;i<=n;i++){
            System.out.print(" ");
        }
        {
            for(int k=1;k<=star;k++){
                System.out.print("A");

            }
           
        }
        System.out.println();
        space--;
        star=star-2;}
    }

}
