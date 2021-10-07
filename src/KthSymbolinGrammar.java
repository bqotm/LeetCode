public class KthSymbolinGrammar {



    public int kthGrammar(int n, int k) {
        if(n==1 && k==1)
            return 0;
        return kthGrammar(n-1, (k+k%2)/2)==0 ? ((k%2==1) ? 0 : 1) : ((k%2==1) ? 1 : 0);
    }
}
