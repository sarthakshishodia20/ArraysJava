import java.util.ArrayList;

public class WordsContainingCharacter {
    public static void getAnswer(String[] words,ArrayList<Integer> ans,char x){
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    ans.add(i);
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        String[] words={"Leetcode","CodeLeet"};
        char x='e';
        getAnswer(words,ans,x);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
