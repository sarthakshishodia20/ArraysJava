import java.util.Arrays;

public class Stringed{
    public static String Reverse(String str){
        StringBuilder s=new StringBuilder(str);
        for(int i=0;i<s.length()/2;i++){
            int front=i;
            int back=s.length()-i-1;

            char frontchar=s.charAt(front);
            char backchar=s.charAt(back);

            s.setCharAt(front, backchar);
            s.setCharAt(back, frontchar);

        }
        return s.toString();
    }
    public static int Countvowels(String S){
        S=S.toLowerCase();
        int count=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='o'||S.charAt(i)=='i'|| S.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static boolean Anagram(String S1,String S2){
        S1=S1.toLowerCase();
        S2=S2.toLowerCase();
        if(S1.length()==S2.length()){
            char[] a=S1.toCharArray();
            char[] b=S2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a, b)){
                return true;
            }
        }
        return false;
    }
    public static String toupper(String str){
       StringBuilder sb=new StringBuilder("");
       char ch=Character.toUpperCase(str.charAt(0));
       sb.append(ch);
       for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' '&& i<str.length()-1){
                 sb.append(str.charAt(i));
                 i++;
                 sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
        
       }
       return sb.toString();
    }
    public static String Compress(String str){
        StringBuilder sb=new StringBuilder("");
        // String str1="";
        for(int i=0;i<str.length();i++){
             Integer count=1;
            while(i<str.length()-1 &&  str.charAt(i)==str.charAt(i+1)){
                   count++;
                   i++;
                   

            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
            // count=0;
        }
        return sb.toString();   
    }
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder("Tony");
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));
        // sb.setCharAt(0, 'a');
        // System.out.println(sb);
        // sb.insert(0, 's');
        // System.out.println(sb);
        // sb.delete(0, 1);
        // System.out.println(sb);
        // sb.delete(0, 1);
        // System.out.println(sb);
        // sb.insert(0, 'S');
        // System.out.println(sb);
        // sb.append("e");
        // sb.append("h");
        // sb.append("hello");
        // String str="Sarthak";
        // String sar=null;
        
        // System.out.println(sar.length());
        String city="delhi";
        char[] c=city.toCharArray();
        c[0]='D';
        city.toString();
        System.out.println(city);
        System.out.println(Reverse("hello"));
        // String S1="heart";
        // String S2="earthi";
        // String vowels="ABCHDLNWNLBISKBQSLKQBKEKAHBDQLIASHKBKDBKDoI";
        // System.out.println(Countvowels(vowels));
        // System.out.println(Anagram(S1, S2));
        // String nam="abbccc";
        // System.out.println(Compress(nam));
        // String name="Sarthak Shshodia from bulandshahar khujr auttarpradesh";
        // System.out.println(toupper(name));
        // String fruits[]={"manogo","apple","banana"};
        // String largest=fruits[0];
        // for(int i=0;i<fruits.length;i++){
        //     if(largest.compareToIgnoreCase(fruits[i])>0){
        //         largest=fruits[i];
        //     }
        // }
        // System.out.println(largest);
        
    }
}