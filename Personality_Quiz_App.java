```java
import java.util.Scanner;

public class PersonalityQuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int response;
        int score = 0;

        System.out.println("Welcome to the Personality Quiz!");
        System.out.println("Please answer the following questions with a number from 1 to 5, 1 being 'Not at all' and 5 being 'Absolutely'");

        System.out.println("Question 1: Do you enjoy socializing with large groups of people?");
        response = scanner.nextInt();
        score += response;

        System.out.println("Question 2: Do you prefer to plan ahead rather than being spontaneous?");
        response = scanner.nextInt();
        score += response;

        System.out.println("Question 3: Do you find it easy to express your feelings?");
        response = scanner.nextInt();
        score += response;

        System.out.println("Question 4: Do you enjoy trying new things?");
        response = scanner.nextInt();
        score += response;

        System.out.println("Question 5: Do you often find yourself lost in thought?");
        response = scanner.nextInt();
        score += response;

        System.out.println("Your score is: " + score);

        if(score <= 10) {
            System.out.println("You are introverted and thoughtful.");
        } else if(score <= 20) {
            System.out.println("You are balanced and adaptable.");
        } else {
            System.out.println("You are outgoing and expressive.");
        }
    }
}
```