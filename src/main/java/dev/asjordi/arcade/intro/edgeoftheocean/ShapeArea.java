package dev.asjordi.arcade.intro.edgeoftheocean;

public class ShapeArea {

    int solution(int n) {
        if (n >= Math.pow(n, 4) || n < 1) return 1;
        return (n * n) + ((n - 1) * (n - 1));
    }

}
