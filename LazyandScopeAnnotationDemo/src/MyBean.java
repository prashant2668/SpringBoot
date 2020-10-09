public class MyBean {

  @Autowired
  @Lazy
  private MyLazyBean myLazyBean;

  @PostConstruct
  public void init () {
      System.out.println(getClass().getSimpleName() + " has been initialized");
  }

  public void doSomethingWithLazyBean () {
      System.out.println("Using lazy bean");
      myLazyBean.doSomething();
  }
}