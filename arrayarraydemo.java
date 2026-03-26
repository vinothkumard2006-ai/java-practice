public class  arrayarraydemo {
    public static void main(String[] args) {
        String[][]movies={
            {"Gilli","Theri","Goat","Martin"},
            {"Singam","Singam2","Singam3"},
            {"vetri","gilli1","goat1"}};

        for (int i=0;i<movies.length;i++){
        System.out.print(movies[i][0]+":");
        for (int j=1;j<movies[i].length;j++){
        System.out.print(movies[i][j]+":");
                }
            }
        }
    }

