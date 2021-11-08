import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {


    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        char[] str = s.toCharArray();
        permute(res, 0, str);
        return res;

    }

    private void permute(List<String> res, int i, char[] str) {
        if (i == str.length) {
            res.add(String.valueOf(str));
            return;
        }
        if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z')) {
            str[i] = (str[i] >= 'a' && str[i] <= 'z') ? (char) (str[i] - 32) : (char) (str[i] + 32);
            permute(res, i + 1, str);
            str[i] = (str[i] >= 'a' && str[i] <= 'z') ? (char) (str[i] - 32) : (char) (str[i] + 32);
        }
        permute(res, i + 1, str);

    }

}
