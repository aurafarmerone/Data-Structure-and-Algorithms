public class StringCompression {
    public static void main(String[] args) {
        
        String s = "aaaabbbcdddee"; // "a4b3c1d3e2"
        
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        for(int i=0; i<s.length() ;i++){
            count = 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            sb.append(count);
        }

        System.out.print(sb);
    }
}
