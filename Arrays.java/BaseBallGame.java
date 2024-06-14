import java.util.Stack;

public class BaseBallGame {
    public static int calc(String[] operations)
    {
        Stack<Integer> s=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                s.push(s.peek()+s.elementAt(s.size()-2));
            }
            else if(op.equals("D")){
                s.push(s.peek()*2);
            }
            else if(op.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;

    }
    public static void main(String[] args) {
        String[]ops = {"5","2","C","D","+"};
        int ans=calc(ops);
        System.out.println(ans);

    }
}
