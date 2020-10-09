import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

public class MyConfig {

  @Bean
  public MyBean eagerBean () {
      return new MyBean();
  }

  @Bean
  @Lazy
  public MyLazyBean lazyBean () {
      return new MyLazyBean();
  }
}