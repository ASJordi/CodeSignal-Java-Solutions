package dev.asjordi.arcade.intro.thejourneybegins;

public class CheckPalindrome {

    boolean solution(String inputString) {
        StringBuilder reverse = new StringBuilder(inputString);

        return inputString.equals(reverse.reverse().toString());
    }

}
