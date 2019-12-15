package x5lab;

public class Service {
  private String name;
  private Widget widget;

  public Service(String name, Widget widget) {
    this.name = name;
    this.widget = widget;
  }

  public void execute() {
    widget.handle(name);
  }

  public interface Widget {
    void handle(String thing);
  }
}
