import java.util.*;

public class HighFive {
    public static void main(String[] args) {
        int[][] items = {
                { 1, 95 }, { 1, 76 }, { 2, 91 }, { 1, 92 }, { 1, 88 }, { 1, 79 }, { 1, 99 }, { 1, 79 }, { 1, 89 },
                { 2, 78 }, { 1, 85 }, { 3, 85 }, { 2, 89 }, { 2, 90 }, { 2, 98 }, { 2, 87 },
                { 3, 70 }, { 3, 75 }, { 2, 82 }, { 3, 90 }, { 3, 88 }, { 3, 86 }
        };

        System.out.println("Avg=> " + calculateTopFiveAvg(items));
    }

    public static Map<Integer, Integer> calculateTopFiveAvg(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> studentScore = new HashMap<>();

        for (int[] item : items) {
            int studentId = item[0];
            int score = item[1];

            studentScore.putIfAbsent(studentId, new PriorityQueue<>());
            PriorityQueue<Integer> scores = studentScore.get(studentId);
            System.out.println("Scores => " + scores);
            scores.offer(score);

            if (scores.size() > 5) {
                scores.poll();
            }
        }

        Map<Integer, Integer> topFiveAvg = new HashMap<>();

        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : studentScore.entrySet()) {
            int studentId = entry.getKey();
            PriorityQueue<Integer> scores = entry.getValue();

            int sum = 0;
            int count = scores.size();

            while (!scores.isEmpty()) {
                sum = sum + scores.poll();
            }

            int avg = sum / count;
            topFiveAvg.put(studentId, avg);
        }

        return topFiveAvg;
    }
}
