package BuilderDesignPattern.Desktop_Example;

public class Director {
    private DesktopBuilder desktopBuilder;

    public Director(DesktopBuilder desktopBuilder) {
        this.desktopBuilder = desktopBuilder;
    }

    Desktop getDesktop() {
        return desktopBuilder.getDesktop();
    }

    Desktop buildDeskstop() {
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
