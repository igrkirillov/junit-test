package x5lab;

import name.falgout.jeffrey.testing.junit.mockito.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {
  @Mock
  private Service.Widget widget;

  @InjectMocks
  private Service service = new Service("Joe", widget);

  @Test
  void foo() {
//    MockitoAnnotations.initMocks(service);
    service.execute();
    verify(widget).handle("Joe");
  }
}