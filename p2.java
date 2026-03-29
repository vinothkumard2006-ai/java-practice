public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int space =n-1;
		int star=1;
		for(int i = 1;i<=n;i++){

		
			for(int j = 1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k = 1;k<=star;k++)
			{
				System.out.print("* ");
			}
System.out.println();
space--;
star=star+2;}
	}

}

