public class test {
    public static void main(String [] args) {

        int nbPositifs = 0;
        int index = 0;

        // A) Déclaration, instanciation et initialisation des tableaux "tab1" et "tab2"
        int [] tab1 = {-4, 3, -10, 5, 2, 9};
        int [] tab2 = {2, -3, 6, 5, 1, -9, 7};

        // B) Déclaration et instanciation du tableau "positifs"
        int [] positifs;

        // C) Initialisation des valeurs du tableau "positifs"
        for (int i = 0; i < tab1.length; i++)
        {
            if (tab1[i] >= 0)
            {
                nbPositifs++;
            }
        }
        for (int j = 0; j < tab2.length; j++)
        {
            if (tab2[j] >= 0)
            {
                nbPositifs++;
            }
        }
        positifs = new int [nbPositifs];

        for (int i = 0; i < tab1.length; i++)
        {
            if (tab1[i] >= 0)
            {
                positifs[index] = tab1[i];
                index++;
            }
        }
        for (int i = 0; i < tab2.length; i++)
        {
            if (tab2[i] >= 0)
            {
                positifs[index] = tab2[i];
                index++;
            }
        }
        for (int i = 0; i < positifs.length; i++)
        {
            System.out.print(positifs[i] + " ");
        }
    }
}
