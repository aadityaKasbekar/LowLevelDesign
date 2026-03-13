from SingletonMeta import SingletonMeta

class Logger(metaclass=SingletonMeta):

  def __init__(self) -> None:
    pass

  def Log(self, message: str):
    print(message)
    print(f"""The Logger instance used for printing the above log message is:
          {self}""")