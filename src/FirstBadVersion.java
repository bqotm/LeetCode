public class FirstBadVersion {

    boolean isBadVersion(int version){
        return true;
    };

    public int firstBadVersion(int n) {
        int res=0,l=1, h=n, m;
        while(l<h){
            m=(l+h)/2;
            if(isBadVersion(m)){
                res=m;
                h=m-1;
            }
            else
                l=m+1;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(1/2);
    }

}
