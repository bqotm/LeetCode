public class ReverseWordsinaStringIII {


    /*
    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"
     */


    public static String reverseWords(String s) {
        int i=0,j=0;
        StringBuilder res=new StringBuilder();
        while(j<s.length()){
            StringBuilder word=new StringBuilder();
            while(j<s.length() && s.charAt(j)!=' ') {
                word.append(s.charAt(j));
                j++;
            }
            j++;
            res.append(word.reverse()+" ");
        }
        res.setLength(res.length()-1);
        return res.toString();
    }

    public static void main(String[] args) {
        String a="abg s";
        System.out.println(reverseWords(a));
    }


}
