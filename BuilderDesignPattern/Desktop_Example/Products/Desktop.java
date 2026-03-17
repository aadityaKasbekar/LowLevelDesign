package BuilderDesignPattern.Desktop_Example.Products;


public class Desktop {

  private String monitor;
  private String keyboard;
  private String mouse;
  private String speakers;
  private String ram;
  private String processor;
  private String motherboard;

  public void setMonitor(String monitorName) {
    this.monitor = monitorName;
  }

  public void setKeyboard(String keyboardName) {
    this.keyboard = keyboardName;
  }

  public void setMouse(String mouseName) {
    this.mouse = mouseName;
  }

  public void setSpeakers(String speakersName) {
    this.speakers = speakersName;
  }

  public void setRam(String ramName) {
    this.ram = ramName;
  }

  public void setProcessor(String processorName) {
    this.processor = processorName;
  }

  public void setMotherboard(String motherboardName) {
    this.motherboard = motherboardName;
  }

  @Override
  public String toString() {
    return "Desktop: {\n" +
             "	monitor = " + monitor + "\n" +
             "	keyboard = " + keyboard + "\n" +
             "	mouse = " + mouse + "\n" +
             "	speakers = " + speakers + "\n" +
             "	ram = " + ram + "\n" +
             "	processor = " + processor + "\n" +
             "	motherboard = " + motherboard + "\n" +
             "}";
  }
}
