package dev.asjordi.arcade.intro.edgeoftheocean;

public class AdjacentElementsProduct {

    int solution(int[] inputArray) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length; i++){
            if (i + 1 < inputArray.length){
                int product = inputArray[i] * inputArray[i + 1];
                if (product > max) max = product;
            }
        }

        return max;
    }

}
