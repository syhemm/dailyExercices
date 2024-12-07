import java.sql.SQLOutput;

public class arrays {
    public static void main(String [] args) {
        int mulDeDeux = 0;
        int position = 1;
        int [] tab1 = {2, 3, 8, 9, 64, 72, 93};
        int [] tab2;

        // length starts counting from 1 and not 0
        for (int i = 0; i < tab1.length; i++)
        {
            if (tab1[i] % 2 == 0)
            {
               mulDeDeux++;
            }
        }
        tab2 = new int[mulDeDeux*2];

        for (int i = 0; i < tab1.length; i++)
        {
            if (tab1[i] % 2 == 0)
            {
                tab2[position] = tab1[i];
                position = position + 2;
            }
        }
        for (int i = 0; i < tab2.length; i++)
        {
            System.out.print(tab2[i] + " ");
        }
    }
}
