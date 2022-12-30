string[] answers = new string[questions.Length];

for (int i = 0; i < questions.Length; i++)
{
    Console.WriteLine(questions[i]);
    answers[i] = Console.ReadLine();
}