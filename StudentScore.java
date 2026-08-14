public class StudentScore {

    public static void main(String[] args) {

        // Array 2 มิติ
        int[][] scores = {
            {18, 18, 25, 40},
            {7, 15, 20, 35},
            {10, 20, 28, 42},
            {6, 16, 22, 30},
            {9, 19, 27, 45}
        };

        // Array 1 มิติ สำหรับเก็บคะแนนรวม
        int[] total = new int[scores.length];

        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        int grandTotal = 0;

        // 1. คำนวณคะแนนรวมของนักศึกษาแต่ละคน
        for (int i = 0; i < scores.length; i++) {

            for (int j = 0; j < scores[i].length; j++) {
                total[i] += scores[i][j];
            }

            System.out.println(
                "Student " + (i + 1) + " Total = " + total[i]
            );

            // 2. หาคะแนนสูงสุดและต่ำสุด
            if (total[i] > highest) {
                highest = total[i];
            }

            if (total[i] < lowest) {
                lowest = total[i];
            }

            grandTotal += total[i];
        }

        // 3. ค่าเฉลี่ยของนักศึกษาทั้งห้อง
        double average = (double) grandTotal / scores.length;

        System.out.println();
        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);

        // 4. แสดงนักศึกษาที่มีคะแนนรวมสูงกว่าค่าเฉลี่ย
        System.out.println();
        System.out.println("Students above average:");

        for (int i = 0; i < total.length; i++) {
            if (total[i] > average) {
                System.out.println("Student " + (i + 1));
            }
        }

        // 5. ค่าเฉลี่ยคะแนนแต่ละประเภท
        double quizAvg = 0;
        double assignmentAvg = 0;
        double midtermAvg = 0;
        double finalAvg = 0;

        for (int i = 0; i < scores.length; i++) {
            quizAvg += scores[i][0];
            assignmentAvg += scores[i][1];
            midtermAvg += scores[i][2];
            finalAvg += scores[i][3];
        }

        quizAvg /= scores.length;
        assignmentAvg /= scores.length;
        midtermAvg /= scores.length;
        finalAvg /= scores.length;

        System.out.println();
        System.out.println("Quiz Average = " + quizAvg);
        System.out.println("Assignment Average = " + assignmentAvg);
        System.out.println("Midterm Average = " + midtermAvg);
        System.out.println("Final Average = " + finalAvg);

        // 6. ค้นหาคะแนนของนักศึกษาคนหนึ่งด้วย index
        int index = 2; // Student 3

        System.out.println();
        System.out.println("Student " + (index + 1) + " scores:");
        System.out.println("Quiz = " + scores[index][0]);
        System.out.println("Assignment = " + scores[index][1]);
        System.out.println("Midterm = " + scores[index][2]);
        System.out.println("Final = " + scores[index][3]);
    }
}