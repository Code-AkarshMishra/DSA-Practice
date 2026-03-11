public class Rotation {
    public static boolean check(String s,String goal){

        if(s.length()!=goal.length()) return false;

        return (s+s).contains(goal);
    }
}