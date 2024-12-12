public class VisualArrayResize {
    public static void main(String[] args){
        String[] array = {"Sou","is","very","cute","<3"};
        drawArray(array);

        System.out.println("Adding 'me'");
        array=resize(array,"me");
        drawArray(array);
        array=resize(array,"love");
        System.out.println("Adding 'love'");
        drawArray(array);
        System.out.println("Adding 'her'");
        array=resize(array,"her");
        drawArray(array);
    }

    public static String[] resize(String[] oldArray, String elementToAdd){
        String[] newArray = new String[oldArray.length+1];
        System.out.println("old array we resizing");
        drawArray(oldArray);
        System.out.println("New Array at first");
        drawArray(newArray);

        for(int i= 0;i<oldArray.length;i++){
            System.out.println("Step "+i);
            newArray[i]=oldArray[i];
            drawArray(newArray);
        }
        System.out.println("Adding last element in new one");
        newArray[newArray.length-1]=elementToAdd;
        drawArray(newArray);
        return newArray;
    }

    public static void drawArray(String[] arrayToDraw) {
        System.out.println("Printing array of length " + arrayToDraw.length);

        for (String word : arrayToDraw) {
            if(word == null){
                System.out.print("." + "______" + ".");
            }
            else
                System.out.print("." + "_".repeat(word.length() + 2) + ".");
        }
        System.out.println();

        for (String word : arrayToDraw) {
            if(word==null){
                System.out.print("| " + "null" + " |");
            }
            else
                System.out.print("| " + word + " |");
        }
        System.out.println();

        for (String word : arrayToDraw) {
            if(word == null){
                System.out.print("." + "______" + ".");
            }
            else
                System.out.print("." + "_".repeat(word.length() + 2) + ".");
        }
        System.out.println();

        for (int i = 0; i < arrayToDraw.length; i++) {
            if (arrayToDraw[i] == null) {
                System.out.print("  " + i + " ".repeat(4) + "  ");
            }
            else
                System.out.print("  " + i + " ".repeat(arrayToDraw[i].length()) + "  ");
        }
        System.out.println();

        System.out.println("Done printing array.");
    }



}
