package anz.card.game;

public class CardFlip {

    public static int maximumMoves(char[] arr, int length) {
        int maxMoves = 0;
        int countD = 0;
        for(int i =0;i<length;i++){
            if(arr[i] == 'D'){
                countD++;
            }
        }
        maxMoves = factorial(countD);

        int countU = 0;
        for(int i = 0;i<length;i++){
            if(arr[i] == 'U') {
                countU++;
            }
        }

        if(countU == length){
            return 0;
        }
        return maxMoves + countU;
    }

    private static int factorial(int countD) {
        if(countD == 0){
            return 1;
        }
        return countD * factorial(countD-1);
    }

    public static int minimumMoves(char[] arr, int n) {

        int count = 0;
        int i;
        for(i=0;i<n-1;i++){
            if(arr[i] == 'D' && arr[i+1] == 'D'){
                arr[i] = 'U';
                arr[i+1] = 'U';
                count++;
            }

            else if(arr[i] == 'D' && arr[i+1] =='U') {
                arr[i] = 'U';
                arr[i + 1] = 'D';
                count++;

            }
        }

        if(i == n-1 && arr[i] == 'D'){
            arr[i] = 'U';
            count++;
        }
        return count;
    }
}
