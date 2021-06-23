public class BasicTest{
  public static void bar()
  {
    System.out.println("bar bar?");
  }
  public static void foo(String[] args)
  {
    System.out.println("foo!");
    //обработка данных
  }
  public static void main (String[] args) 
  {
    bar();
    foo(args);
  }
}
