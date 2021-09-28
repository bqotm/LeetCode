import java.util.List;

public class VersionControl {


    public static int firstBadVersion(boolean[] versions) {

        int i=0,j=versions.length,m,res=0;
        while(i<=j){
            m=(i+j)/2;
            if(versions[m]==Boolean.TRUE){
                res=m;
                j=m-1;
            } else {
                i=m+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        boolean array1[];
        array1 = new boolean[5];
        array1[0] = false;
        array1[1] = false;
        array1[2] = true;
        array1[3] = true;
        System.out.println(firstBadVersion(array1));
    }
}
