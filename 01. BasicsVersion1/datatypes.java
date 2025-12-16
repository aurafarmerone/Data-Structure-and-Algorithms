public class Hello1 {
    public static void main(String[] args) {
        byte a = 127; // -128 to 127 (1 byte = 8bits) > 2**8 = 256  >>> 256/2 = 128
        short s = 32767; // 2 bytes
        char ch = 'a'; // 2  bytes
        int x = 214700; // 4 bytes
        float f = 3.14f; // 4 bytes
        long l = 7468635863L; // 8 bytes
        double db = 7373737.83 ; // 8 bytes
        String str = "Hello "; // not fixed bytes
     }
}
