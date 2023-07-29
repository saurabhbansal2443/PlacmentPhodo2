import java.util.Arrays;

public class SecondMaxFrequency {
    public static void main(String[] args) {
        String str = "baaabbbccc dddDDDdddddd iIIIiiii ";


        System.out.println(find(str));

    }

    public static char find(String str){

        int[] fre = new int[26];

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            int idx =-1;

            if(ch!=' '){

                if(ch>='a' && ch<='z'){
                    idx=(int)ch-'a';
                }else if (ch>='A' && ch<='Z'){
                    idx=(int)ch-'A';
                }

                if(idx!=-1){
                    fre[idx]=fre[idx]+1;
                }
            }
        }

        int maxIdx=0;
        int smaxIdx=0;

        for(int i=1;i<fre.length;i++){

            if(fre[maxIdx]<fre[i]){
                smaxIdx=maxIdx;
                maxIdx=i;
            }else if ( fre[smaxIdx]<fre[i]){
                smaxIdx=i;
            }
        }

        char ans = (char)( smaxIdx +'A');

        return ans;
    }
}
