import java.util.Stack;
public class RemoveOuterString {
    public static void main(String[] args) {
        String str="(()())(())";
        String ans=RemoveOuter(str);
        System.out.println(ans);
    }
    public static String RemoveOuter(String str){
        Stack<Character> s=new Stack<>();
        int open=1;
        int cose=0;
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                open++;
                s.push(ch);
            }
            else{
                cose++;
                s.push(ch);
            }
            if(open==cose){
                open=1;
                s.pop();
                i++;
                cose=0;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());

        }
        return sb.reverse().toString();
    }
    
}
