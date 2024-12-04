public class AdressCopyReference {
    public static void main(String[] args){

        String a = "hello";

        testFct(a);

        System.out.println(a);
    }

    public static void testFct(String a){
        a =a + " world";
        System.out.println(a);
    }
}
