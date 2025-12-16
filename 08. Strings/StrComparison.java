public class StrComparison {
    public static void main(String[] args) {

        // " == " -----> Check address

        String s1 = "Tony"; // address
        String s2 = "Tony"; // point to s1 address
        String s3 = new String("Tony"); // new address

        // check s1 and s2 (String Pool) 
        if(s1 == s2){
            System.out.println("Equal ");
        }else{
            System.out.println("Not Equal");
        }
        // check s1 and s3 (new keyword create new String that are not in String Pool)
        if(s1 == s3){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        // .equals function  (only check Value of String not address)
        if(s1.equals(s3)){
             System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
