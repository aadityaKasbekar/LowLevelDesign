from BuilderDesignPattern.Destop_Example_Python.Builders.DELLDesktopBuilder import DELLDesktopBuilder
from BuilderDesignPattern.Destop_Example_Python.Builders.DesktopBuilder import DesktopBuilder
from BuilderDesignPattern.Destop_Example_Python.Builders.HPDesktopBuilder import HPDesktopBuilder
from BuilderDesignPattern.Destop_Example_Python.Director.Director import Director
from BuilderDesignPattern.Destop_Example_Python.Products.Desktop import Desktop


class Driver:
    def main(self):
        hpDesktopBuilder: DesktopBuilder = HPDesktopBuilder()
        dellDesktopBuilder: DesktopBuilder = DELLDesktopBuilder()

        director1: Director = Director(hpDesktopBuilder)
        director2: Director = Director(dellDesktopBuilder)

        desktop1: Desktop = director1.buildDesktop()
        desktop2: Desktop = director2.buildDesktop()

        print(desktop1)
        print(desktop2)

if __name__ == "__main__":
    driver: Driver = Driver()
    driver.main()