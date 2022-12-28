```python
class Question:
    def __init__(self, prompt, answers):
        self.prompt = prompt
        self.answers = answers

class PersonalityQuiz:
    def __init__(self, questions):
        self.questions = questions
        self.results = {}

    def take_quiz(self):
        for question in self.questions:
            print(question.prompt)
            for i, answer in enumerate(question.answers):
                print(f"{i+1}. {answer}")
            answer = input("Choose an option: ")
            self.results[question.prompt] = question.answers[int(answer)-1]
        self.show_results()

    def show_results(self):
        print("\nYour Results:")
        for question, answer in self.results.items():
            print(f"{question} - {answer}")

questions = [
    Question("What is your favorite color?", ["Red", "Blue", "Green", "Yellow"]),
    Question("What is your favorite animal?", ["Dog", "Cat", "Bird", "Fish"]),
    Question("What is your favorite season?", ["Spring", "Summer", "Autumn", "Winter"]),
]

quiz = PersonalityQuiz(questions)
quiz.take_quiz()
```