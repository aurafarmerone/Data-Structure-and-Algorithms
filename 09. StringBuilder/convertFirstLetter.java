public class convertFirstLetter {

/*
str.toUpperCase()	           ✅ Yes (Complete String (obj) )
char.toUpperCase()	           ❌ No  (not object)
Character.toUpperCase(char)    ✅ Yes (now it is object)

*/

    public static void main(String[] args) {
        
        String s = "this is a code"; // O/P: "This Is A Code"
        System.out.print(FirstLetter(s));
    }

    public static String FirstLetter(String s){
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1 ; i< s.length() ; i++){
            if(s.charAt(i) == ' '){
                sb.append(s.charAt(i));
                sb.append(Character.toUpperCase(s.charAt(i+1)));
                i++;
            }else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();

    }
}
