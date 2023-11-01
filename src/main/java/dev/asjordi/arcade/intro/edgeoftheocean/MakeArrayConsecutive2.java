package dev.asjordi.arcade.intro.edgeoftheocean;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MakeArrayConsecutive2 {

    int solution(int[] statues) {
        Arrays.sort(statues);
        int[] temp = IntStream.rangeClosed(statues[0], statues[statues.length - 1]).toArray();

        return temp.length - statues.length;
    }

}
