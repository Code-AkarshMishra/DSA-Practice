public class Valleys {
    public static int count(String s){

        int level=0,valley=0;

        for(char c:s.toCharArray()){

            if(c=='U') level++;
            else level--;

            if(level==0 && c=='U')
                valley++;
        }

        return valley;
    }
}