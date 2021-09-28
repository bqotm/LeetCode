import java.util.Arrays;
import java.util.HashSet;

public class UniqueEmails {


    public static int numUniqueEmails(String[] emails) {

        HashSet<String> set=new HashSet<>();
        for(String email: emails){
            String[] split=email.split("@");
            String[] sec=split[0].split("\\+");
            set.add(sec[0].replace(".", "") + "@" + split[1]);
            System.out.println(sec[0].replace(".",""));
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] emails={"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

}
