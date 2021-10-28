public class AddBinary {





    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int d=0;
        int ax, bx;
        while(i>=0 && j>=0){

            ax=Integer.parseInt(String.valueOf(a.charAt(i)));
            bx=Integer.parseInt(String.valueOf(b.charAt(j)));
            if(ax+bx+d==2){
                stringBuilder.append('0');
                d=1;
            } else if(ax+bx+d==3){
                stringBuilder.append('1');
                d=1;
            } else if((ax^bx)==1 && d==0){
                stringBuilder.append('1');
            } else {
                stringBuilder.append(d);
                d=0;
            }
            i--;
            j--;
        }
        while(i>=0){
            ax=Integer.parseInt(String.valueOf(a.charAt(i)));
            if((ax+d)>=2){
                stringBuilder.append('0');
                d=1;
            } else if((ax^d)==1){
                stringBuilder.append('1');
                d=0;
            } else{
                stringBuilder.append('0');
                d=0;
            }
            i--;
        }
        while(j>=0){
            bx=Integer.parseInt(String.valueOf(b.charAt(j)));
            if((bx+d)>=2){
                stringBuilder.append('0');
                d=1;
            } else if((bx^d)==1){
                stringBuilder.append('1');
                d=0;
            } else{
                stringBuilder.append('0');
                d=0;
            }
            j--;
        }
        if(d!=0)
            stringBuilder.append(d);
        return stringBuilder.reverse().toString();
    }


}
