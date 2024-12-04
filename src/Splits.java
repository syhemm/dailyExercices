public class Splits {
    public static void main(String[] args) {
        String msg = "hello, tomato, blue, laptop, tomato, red";
        String[] tab = msg.split(", ");
        String[] tabRes = new String[tab.length];

        ajouterTab(tab, tabRes);
        for(int i= 0;i<tabRes.length && tabRes[i]!=null;i++){
            System.out.println(tabRes[i]);
        }
    }
    public static boolean stringExist (String[] tab, String mot) {
        for (int i = 0; i < tab.length; i++)
        {
            if (tab[i]!= null && tab[i].equals(mot))
            {
                return true;
            }
        }
        return false;
    }
    public static void ajouterTab (String[] tab, String[] mot) {
        for (int i = 0; i < tab.length; i++)
        {
            if (!stringExist(mot, tab[i]))
            {
                ajouterElement(mot, tab[i]);
            }
        }
    }

    public static void ajouterElement (String[] tab, String mot) {
        for(int i = 0; i < tab.length; i++)
        {
            if (tab[i] == null)
            {
                tab[i] = mot;
                break;
            }
        }
    }
}
