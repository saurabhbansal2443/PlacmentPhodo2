public class countVowels {
    public static void main(String[] args) {
        String str ="Hello in the world of java";

        int ans = count(str);

        System.out.println(ans);
    }

    public static int count(String str){
        if(str.length()==0){
            return 0;
        }

        int count =0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='A'|| ch=='e' || ch=='E'||ch=='i' || ch=='I'|| ch=='o' || ch=='O'||ch=='u' || ch=='U'){
                count++;
            }
        }

        return count;
    }
}
