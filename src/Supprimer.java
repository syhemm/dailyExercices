public class Supprimer {
    public static void main(String[] args) {
    String message = "math science math anglais philo math science math anglais philo hi";
        System.out.println(getNumUniqueValues(message));
    }

/*    public static String[] genererLexique(String message) {
        String[] listeDeMots = message.split("[ ,;!?.:\"]+");
        String[] listeLexique = new String [listeDeMots.length];
        int pos = 0;

        for (int i = 0; i < listeDeMots.length; i++)
        {
            int val =compteur(listeLexique,listeDeMots[i]);
            if(val<1){
                listeLexique[pos] = listeDeMots[i];
                pos++;
            }
        }
        return listeLexique;
    }*/

    public static int getNumUniqueValues(String message){
        String[] values = message.split("[ ,;!?.:\"]+");
        int wordCount = values.length;

        int cpt;
        for(int i = 0;i<values.length;i++){
            cpt = 0;
            for(int j =0; j<values.length; j++){
                if(i!=j && values[i].equals(values[j])){
                    cpt++;
                }
                break;
            }
            System.out.println(values[i]+ " is there "+cpt+" times");
            wordCount-=cpt;
        }
        return wordCount;
    }

}
