package Test;
import java.util.*;
class ransom {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int count=0;
        for(int i=0;i<ransomNote.length();i++)
        {
            for(int j=0;j<magazine.length();j++)
            {
                if(ransomNote.charAt(i)==magazine.charAt(j)){
                    count++;
                    i++;
                    j++;
                }
            }
        }
        System.out.println(count);
        if(count==ransomNote.length()) return true;
        else return false;
    }
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	String s1= sc.next();
    	String s2= sc.next();
    	boolean s3= canConstruct(s1,s2);
    	System.out.println(s3);
    }
}