public class Main {
    public static void main(String[] args) {
        Student[] S = new Student[]{new Student("Tom", 96),
                new Student("Nazar", 50.9),
                new Student("Tom", 56)};
        int numbersofstudent = S.length;
        double averrating=0;
        for (int i = 0; i < numbersofstudent; i++) {
            System.out.println(S[i]);
            averrating += S[i].Getrating();
        }
        averrating = averrating/numbersofstudent;
        System.out.println("Average rating is - " + averrating);
        S[1].changeRating(100);
        for (int i = 0; i < numbersofstudent; i++)
            System.out.println(S[i]);

    }
}
