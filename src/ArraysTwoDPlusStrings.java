public class ArraysTwoDPlusStrings {
    public static void main(String[] args){
        String string = "Ab ra c ad!ab,.ra";
        System.out.println(onlyLetters(string));
        System.out.println(getUniqueString(string));

        int[] testTab = getLetters(string);

        for(int i=0;i<testTab.length;i++){
            System.out.println((char)testTab[i]);
        }

        System.out.println(countChar(testTab, 'i'));
    }

    public static int[] getLetters(String s){
        int[] tab =new int[s.length()];
        for(int i =0;i<s.length();i++){
            tab[i]=s.charAt(i);
        }

        return tab;
    }

    public static int countChar(int[] tab, char a){
        int count = 0;
        for(int i =0 ;i<tab.length;i++){
            if(tab[i]==a){
                count++;
            }
        }


        return count;
    }

    public static boolean cointainsLetter(String s, char letter){
        if(s.indexOf(letter)==-1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static String getUniqueString(String nonUniqueString){
        String uniqueString="";

        for(int i=0;i<nonUniqueString.length();i++){
            if(!cointainsLetter(uniqueString,nonUniqueString.charAt(i))){
                uniqueString+=nonUniqueString.charAt(i);
            }
        }

        return uniqueString;
    }

    public static String onlyLetters(String s){
        String[] lettres = s.split("[ ,;!?.:\"]+");
        String lettersOnlyString = "";

        for(int i =0;i<lettres.length;i++)
        {
            lettersOnlyString+=lettres[i];
        }

        return lettersOnlyString;
    }


}
