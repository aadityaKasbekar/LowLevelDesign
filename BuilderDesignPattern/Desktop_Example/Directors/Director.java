package BuilderDesignPattern.Desktop_Example.Directors;

import BuilderDesignPattern.Desktop_Example.Builders.DesktopBuilder;
import BuilderDesignPattern.Desktop_Example.Products.Desktop;

public class Director {
    private DesktopBuilder desktopBuilder;

    public Director(DesktopBuilder desktopBuilder) {
        this.desktopBuilder = desktopBuilder;
    }

    public Desktop getDesktop() {
        return desktopBuilder.getDesktop();
    }

    public Desktop buildDeskstop() {
        desktopBuilder.buildMonitor();
        desktopBuilder.buildKeyboard();
        desktopBuilder.buildMouse();
        desktopBuilder.buildSpeakers();
        desktopBuilder.buildMotherboard();
        desktopBuilder.buildProcessor();
        desktopBuilder.buildRam();
        return desktopBuilder.getDesktop();
    }
}
