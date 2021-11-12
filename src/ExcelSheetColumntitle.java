import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ExcelSheetColumntitle {





    public static String convertToTitle(int columnNumber) {
        char[] alph="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        while(columnNumber>0){
            if(columnNumber%26==0) {
                stringBuilder.append('Z');
                columnNumber=columnNumber/26-1;
            }else{
                stringBuilder.append(alph[columnNumber%26-1]);
                columnNumber=columnNumber/26;
            }
        }
        return stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }


}
