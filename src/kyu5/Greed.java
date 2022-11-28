package kyu5;

import java.util.HashMap;
import java.util.Map;

public class Greed {
    public static int greedy(int[] dice) {
        int score = 0;

        Map<Integer, Integer> points = new HashMap<>();

        for (int die : dice) {
            if (points.containsKey(die)) {
                int current = points.get(die) + 1;

                if (current == 3) {
                    if (die == 1) {
                        score += 1000;
                    } else {
                        score += die * 100;
                    }
                    points.put(die, 0);
                } else {
                    points.put(die, current);
                }
            } else {
                points.put(die, 1);
            }
        }

        score += points.getOrDefault(1, 0) * 100;
        score += points.getOrDefault(5, 0) * 50;

        return score;
    }

    public static void main(String[] args) {
        System.out.println(greedy(new int[]{2, 4, 4, 5, 4}));
    }
}
