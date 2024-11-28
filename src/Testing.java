public class Testing {
    public static void main(String[] args) {
        String t = "Here is some string to print backwards";
        int[] tab = new int[5];
        int num = 9;
        int maxPower = findMaxPowerTwo(num);
        String s = "";

        for(int i = maxPower; i>=0 ;i--){
           if(num>=Math.pow(2,i)){
               s+="1";
               num-=Math.pow(2,i);
           }
           else{
               s+="0";
           }

        }

        System.out.println(s);


    }

    public static int findMaxPowerTwo(int num){
        for(int i = 0; i < 99999; i++){
            if(Math.pow(2,i)> num){
                return i-1;
            }
        }
        return 0;
    }

}
