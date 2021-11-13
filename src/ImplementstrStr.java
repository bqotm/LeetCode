public class ImplementstrStr {


    public int strStr(String haystack, String needle) {

        if(needle.length()==0)
            return 0;
        return haystack.indexOf(needle);

    }
}
