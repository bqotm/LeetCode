public class ReplaceElementswithGreatestElementonRightSide {



    public int[] replaceElements(int[] arr) {

        int k,max=-1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>max){
                k=max;
                max=arr[i];
                arr[i]=k;
            }
            else{
                arr[i]=max;
            }
        }
        return arr;
    }
}
