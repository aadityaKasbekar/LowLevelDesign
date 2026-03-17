package BuilderDesignPattern.Desktop_Example;

import BuilderDesignPattern.Desktop_Example.Builders.DellDektopBuilder;
import BuilderDesignPattern.Desktop_Example.Builders.DesktopBuilder;
import BuilderDesignPattern.Desktop_Example.Builders.HpDesktopBuilder;
import BuilderDesignPattern.Desktop_Example.Directors.Director;
import BuilderDesignPattern.Desktop_Example.Products.Desktop;

public class Driver {
	public static void main(String[] args) {
		DesktopBuilder hpDesktopBuilder = new HpDesktopBuilder();
		DesktopBuilder dellDesktopBuilder = new DellDektopBuilder();

		Director director1 = new Director(hpDesktopBuilder);
		Director director2 = new Director(dellDesktopBuilder);

		Desktop desktop1 = director1.buildDeskstop();
		Desktop desktop2 = director2.buildDeskstop();

		System.out.println(desktop1);
		System.out.println(desktop2);
	}
}
