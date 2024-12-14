public class Supp {
    public static void main(String[] args) {
        String[] motss = {"hello","potato","hello","apple"};
        String[] motsTab;

        motsTab = suppMots(motss, 2);

        for (int i = 0; i < motsTab.length; i++)
        {
            System.out.println("tab: " + motsTab[i]);
        }
    }

    public static String[] suppMots(String[] mots, int position) {
        String[] nouveauTab = new String[mots.length-1];
        int index = 0;

        for (int i = 0; i < mots.length; i++)
        {
            if (i != position)
            {
                nouveauTab[index++] = mots[i];
            }
        }
        return nouveauTab;
    }
}
