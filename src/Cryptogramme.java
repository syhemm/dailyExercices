public class Cryptogramme {
    public static void main(String[] args) {

        String msg = "Asterix et Obelix";
        int key = 1;
        String msgEncr = "";
        String msgDecode = "";

        for (int i = 0; i < msg.length(); i++)
        {
           msgEncr += (char)(msg.charAt(i) + key);
        }

        System.out.println("msg encrypter: " + msgEncr);

        for (int i = 0; i < msgEncr.length(); i++)
        {
            msgDecode += (char)(msgEncr.charAt(i) - key);
        }
        System.out.println("msg decode: " + msgDecode);
    }

}
