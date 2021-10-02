public class ReverseString {



    public void reverseString(char[] s){
        reverse(s, 0, s.length-1);
    }

    public static void reverse(char[] s, int i, int j){
        if(i<j){
            char k=s[i];
            s[i]=s[j];
            s[j]=k;
            reverse(s,i+1,j-1);
        }
        return;
    }


}
