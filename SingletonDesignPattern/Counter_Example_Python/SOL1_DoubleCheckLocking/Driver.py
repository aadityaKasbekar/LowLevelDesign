from Counter import Counter

class Driver():

  @staticmethod
  def main() -> None:

    counter1: Counter = Counter.getInstance()
    counter2: Counter = Counter.getInstance()

    print(f"Is the counter1 == counter2 ?: {counter1 == counter2}")
    print(f"The count from both the Counter Objects counter1: {counter1.getCount()} and counter2: {counter2.getCount()}")

    for _ in range(5):
      counter1.increment()
      print(f"Increamenting the count using the counter1 obj but getting the count using counter2 obj: {counter2.getCount()}")

    print(f"Count using counter1 obj: {counter1.getCount()}")


if __name__ == "__main__":

  Driver.main()