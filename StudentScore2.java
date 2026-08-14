public class StudentScore2 {

    // Array 2 มิติ
    static int[][] scores = {
        {18, 18, 25, 40},
        {7, 15, 20, 35},
        {10, 20, 28, 42},
        {6, 16, 22, 30},
        {9, 19, 27, 45}
    };

    // 1. Method คำนวณคะแนนรวมของแต่ละคน
    public static int[] calculateTotal() {

        int[] total = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                total[i] += scores[i][j];
            }
        }

        return total;
    }

    // 2. Method หาคะแนนสูงสุด
    public static int findHighest(int[] total) {

        int highest = total[0];

        for (int i = 1; i < total.length; i++) {
            if (total[i] > highest) {
                highest = total[i];
            }
        }

        return highest;
    }

    // 3. Method หาคะแนนต่ำสุด
    public static int findLowest(int[] total) {

        int lowest = total[0];

        for (int i = 1; i < total.length; i++) {
            if (total[i] < lowest) {
                lowest = total[i];
            }
        }

        return lowest;
    }

    // 4. Method หาค่าเฉลี่ยของนักศึกษาทั้งหมด
    public static double calculateAverage(int[] total) {

        int sum = 0;

        for (int i = 0; i < total.length; i++) {
            sum += total[i];
        }

        return (double) sum / total.length;
    }

    // 5. Method แสดงนักศึกษาที่คะแนนสูงกว่าค่าเฉลี่ย
    public static void showAboveAverage(int[] total, double average) {

        System.out.println("Students above average:");

        for (int i = 0; i < total.length; i++) {
            if (total[i] > average) {
                System.out.println("Student " + (i + 1));
            }
        }
    }

    // 6. Method หาค่าเฉลี่ยของแต่ละประเภทคะแนน
    public static void calculateCategoryAverage() {

        String[] category = {
            "Quiz",
            "Assignment",
            "Midterm",
            "Final"
        };

        for (int j = 0; j < 4; j++) {

            int sum = 0;

            for (int i = 0; i < scores.length; i++) {
                sum += scores[i][j];
            }

            double average = (double) sum / scores.length;

            System.out.println(
                category[j] + " Average = " + average
            );
        }
    }

    // Main
    public static void main(String[] args) {

        // เรียก Method คำนวณคะแนนรวม
        int[] total = calculateTotal();

        // แสดงคะแนนรวม
        for (int i = 0; i < total.length; i++) {
            System.out.println(
                "Student " + (i + 1) +
                " Total = " + total[i]
            );
        }

        System.out.println();

        // เรียก Method หาค่าสูงสุด
        int highest = findHighest(total);
        System.out.println("Highest = " + highest);

        // เรียก Method หาค่าต่ำสุด
        int lowest = findLowest(total);
        System.out.println("Lowest = " + lowest);

        // เรียก Method หาค่าเฉลี่ย
        double average = calculateAverage(total);
        System.out.println("Average = " + average);

        System.out.println();

        // แสดงคนที่สูงกว่าค่าเฉลี่ย
        showAboveAverage(total, average);

        System.out.println();

        // ค่าเฉลี่ยแต่ละประเภท
        calculateCategoryAverage();
    }
}