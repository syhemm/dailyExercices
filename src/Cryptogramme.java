public class Cryptogramme {
    public static void main(String[] args) {

        // char has to be casted for msg.charAt AND the key to return a char

        String msg = "Asterix et Obelix";
        int key = 1;
        String msgEncr = "";
        String msgDecode = "";
        char a = 'a';

        for (int i = 0; i < msg.length(); i++) {
            msgEncr += (char) (msg.charAt(i) + key);
        }

        System.out.println("msg encrypter: " + msgEncr);

        for (int i = 0; i < msgEncr.length(); i++) {
            msgDecode += (char) (msgEncr.charAt(i) - key);
        }
        System.out.println("msg decode: " + msgDecode);

        System.out.println((char) (2+a));
    }
}
