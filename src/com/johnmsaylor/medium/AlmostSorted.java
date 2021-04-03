package com.johnmsaylor.medium;

public class AlmostSorted {
    static void almostSorted(int[] arr) {
        boolean[] table = new boolean[arr.length];

        table[0] = arr[0] > arr[1];

        for(int i = 1; i < arr.length - 1; i++) {
            table[i] = arr[i - 1] > arr[i];
        }

        int firstTick = -1;
        int lastTick = -1;
        int tickCount = 0;

        for (int i = 0; i < table.length; i++) {
            if (firstTick == -1 && table[i] == true) firstTick = i;
            if (table[i] == true){
                lastTick = i;
                tickCount++;
            }
        }

        String answer = "";
        String result = "";

        if (tickCount == 2){
            answer = "yes";
            result = result.concat("swap ");
            result = result.concat(String.valueOf(firstTick));
            result = result.concat(" ");
            result = result.concat(String.valueOf(lastTick));

            int temp = arr[firstTick];
            arr[firstTick] = arr[lastTick];
            arr[lastTick] = arr[firstTick];

        } else if (tickCount > 2) {
            for (int i = firstTick; i <= lastTick - ((lastTick - firstTick) / 2); i++){
                int temp = arr[firstTick];
                arr[firstTick] = arr[lastTick];
                arr[lastTick] = temp;
                firstTick++;
                lastTick--;
            }
            result = result.concat("reverse ");
            result = result.concat(String.valueOf(firstTick));
            result = result.concat(" ");
            result = result.concat(String.valueOf(lastTick));
        } else if (tickCount == 0) {
            answer = "yes";
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]){
                answer = "no";
                break;
            }
        }


        System.out.println(answer);
        if (!result.equals("") | !answer.equals("no")){
            System.out.println(result);
        }

    }
}
