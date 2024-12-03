public class Splits {
    public static void main(String[] args) {
        String msg = "hello, tomato, blue, laptop, red";
        String[] tab = msg.split(", ");

        for (int i = 0; i < tab.length; i++)
        {
            System.out.println(i + ". " + tab[i]);
        }
    }
}
