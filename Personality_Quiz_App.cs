```CSharp
using System;

namespace PersonalityQuizApp
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] questions = new string[]
            {
                "Do you enjoy outdoor activities? (yes/no)",
                "Do you prefer reading books over watching movies? (yes/no)",
                "Do you consider yourself an introvert? (yes/no)"
            };

            string[] answers = new string[questions.Length];

            for (int i = 0; i < questions.Length; i++)
            {
                Console.WriteLine(questions[i]);
                answers[i] = Console.ReadLine();
            }

            int score = 0;

            foreach (string answer in answers)
            {
                if (answer.ToLower() == "yes")
                {
                    score++;
                }
            }

            if (score <= 1)
            {
                Console.WriteLine("Your personality type is: Type A");
            }
            else if (score == 2)
            {
                Console.WriteLine("Your personality type is: Type B");
            }
            else
            {
                Console.WriteLine("Your personality type is: Type C");
            }
        }
    }
}
```