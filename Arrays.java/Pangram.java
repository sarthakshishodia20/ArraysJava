import java.util.HashSet;

public class Pangram {
    public static boolean isPanagram(String sentence){
        HashSet<Character> alphabetSet=new HashSet<>();
        for(int i='a';i<='z';i++){
            alphabetSet.add((char)i);
        }
        for(int i=0;i<sentence.length();i++){
            alphabetSet.remove(sentence.charAt(i));
            if(alphabetSet.isEmpty()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String sentence="abcdefghijklmnopqrstuwxyz";
        System.out.println(isPanagram(sentence));
    }
    
}




