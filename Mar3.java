package mar3;
import java.util.Scanner;
public class Mar3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       String m= s.nextLine();
       System.out.println(k(r(m.toLowerCase())));
    }
     public static String k(String a){
   String b=".", c="";
    for(int i=0;i<a.length();i++){
        c=c+b+a.charAt(i);
        }
          return c;
}
     public static String r(String a){
   String b="", c ;
   StringBuilder sb = new StringBuilder(a);
          for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'
                ||sb.charAt(i)=='o'||sb.charAt(i)=='u'){
             sb.setCharAt(i, '\0');
                }
          c= sb.toString();
           if(Character.isLetter(c.charAt(i)))
               b=b+ c.charAt(i);
        }
          return b;
}
}