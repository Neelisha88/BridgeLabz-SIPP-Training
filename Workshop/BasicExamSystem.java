package Workshop;
import java.util.*;


class Question<T> {
    String questionText;
    ArrayList<T> options;
    T correctAnswer;

    Question(String questionText, ArrayList<T> options, T correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    boolean isCorrectAnswer(T answer) {
        return correctAnswer.equals(answer);
    }
}

class Student {
    String name;
    String rollNumber;

    Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

public class BasicExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Question<String>> javaQuestions = new ArrayList<>();

        ArrayList<String> q1Options = new ArrayList<>();
        q1Options.add("Java Virtual Machine");
        q1Options.add("Just Very Mad");
        q1Options.add("Java Vendor Manual");
        q1Options.add("None of the above");

        javaQuestions.add(new Question<>("What is JVM?", q1Options, "Java Virtual Machine"));

        ArrayList<String> q2Options = new ArrayList<>();
        q2Options.add("class");
        q2Options.add("extends");
        q2Options.add("implements");
        q2Options.add("object");

        javaQuestions.add(new Question<>("Which keyword is used for inheritance in Java?", q2Options, "extends"));

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String roll = sc.nextLine();

        Student student = new Student(name, roll);
        System.out.println("\nHello " + student.name + "! Let's start the Java exam.\n");

        int score = 0;
        for (int i = 0; i < javaQuestions.size(); i++) {
            Question<String> q = javaQuestions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.questionText);

            for (int j = 0; j < q.options.size(); j++) {
                System.out.println((j + 1) + ". " + q.options.get(j));
            }

            System.out.print("Enter your answer (1-" + q.options.size() + "): ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            String selectedAnswer = q.options.get(choice - 1);
            if (q.isCorrectAnswer(selectedAnswer)) {
                score++;
            }
        }
        System.out.println("\nExam finished!");
        System.out.println(student.name + ", you scored " + score + " out of " + javaQuestions.size());
    }
}
