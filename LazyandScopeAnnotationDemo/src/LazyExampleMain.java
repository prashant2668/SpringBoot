import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyExampleMain {

  public static void main (String[] args) {
      ApplicationContext context =
                new AnnotationConfigApplicationContext(
                          MyConfig.class);
      System.out.println("--- container initialized ---");
      MyBean bean = context.getBean(MyBean.class);
      System.out.println("MyEagerBean retrieved from bean factory");
      bean.doSomethingWithLazyBean();
  }
}