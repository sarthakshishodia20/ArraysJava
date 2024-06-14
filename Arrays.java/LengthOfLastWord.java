public class LengthOfLastWord {
    public static int length(String s){
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                if(count>0)
                return count;
            }
        }
        return count;

    }
     public static void main(String[] args) {
        String s="Hello my name is Sarthak";
        System.out.println(length(s));
     }    
}
