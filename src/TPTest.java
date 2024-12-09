import java.sql.SQLOutput;

public class TPTest {
    public static void main(String[] args) {
        String message = "irelia ahri orianna annie irelia annie ashe";
        //String[] messageUnique = new String[1];

        String[] unique = genererLexique(message);

        for (String a:unique)
        {
            System.out.println(a);
        }
    }

    public static String[] genererLexique(String msg) {
        String[] listeChamp = msg.split("[ ,;!?.:\"]+");
        String[] listeChampUnique = new String[1];

        //add first element bc no need to check. array is now full
        listeChampUnique[0] = listeChamp[0];
        //starting at 1 bc 0 added
        for (int i = 1; i < listeChamp.length; i++)
        {
            //checking the string in the original array to see if it's already in the new array
            int count = countingChamps(listeChampUnique, listeChamp[i]);
            if (count == 0)
            {
                //replacing the array with the new func array w/ the added names
                listeChampUnique = resizeAndAddChamp(listeChampUnique, listeChamp[i]);
            }
        }
        return listeChampUnique;
    }
    //need string name to count how many times it's repeated. champs array = listeChampUnique. check if it was added already or not
    public static int countingChamps(String[] champs, String name) {
        int count = 0;

        for (int i = 0; i < champs.length; i++)
        {
            //compareTo return 0 if equal
            if (champs[i].compareTo(name) == 0)
            {
                count++;
            }
        }
        return count;
    }
    //new array in genererLexique (listeChampUnique) used as param bc i want to resize that one + 2nd param string to add
    public static String[] resizeAndAddChamp(String[] oldArray, String name) {
        //+1 bc it will loop in the genererLexique func and add new string every loop
        String[] newArray = new String[oldArray.length+1];
        //oldArray length bc newArray is the one i am adding names to. if newArray.length = out of bounds
        for (int i = 0; i < oldArray.length; i++)
        {
            newArray[i] = oldArray[i];
        }
        //adding the last element in the last box of the array, so -1. last element string as param
        newArray[newArray.length-1] = name;

        return newArray;
    }
}