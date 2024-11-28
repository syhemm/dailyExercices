public class StringTesT {
    public static void main(String[] args) {
        String text = "faith is cute";
        char[] tab1 = new char[text.length()];
        char[] tab2 = new char[text.length()];
        char letter;

        for (int i = 0; i < text.length(); i++)
        {
            letter = text.charAt(i);
            tab1[i] = letter;
            System.out.println(tab1);
        }
        for (int i = text.length()-1; i >= 0; i--)
        {
            letter = text.charAt(i);
            tab2[text.length()-1-i] = letter;
            System.out.println(tab2);
        }
    }
}
