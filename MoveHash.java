public class MoveHash {
    public static String move(String s){

        int count=0;
        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray()){
            if(c=='#') count++;
            else sb.append(c);
        }

        return "#".repeat(count)+sb.toString();
    }
}