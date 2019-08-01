import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;




public class Main {

  public static void main(String[] args) throws IOException {

    final double d = 3.14;

    int x = (int) Math.sqrt(d);
    x += 2;
    x++;
    boolean b = (2 == x);
    int min = x > 0 ? 0 : x;

    Size s = Size.A;
    Size[] sizes=Size.values();
    int position=Size.B.ordinal();//返回他所在的位置
    String str1 = "hello".substring(0, 1) + "o";
    String str2 = 3 + "cute";
    b = str2.equals(str1);
    Scanner scanner = new Scanner(System.in);

    List<String> list = new LinkedList<>();

    if (min < x) {
      System.out.println("input some name，以空格分隔");
    }
    while (scanner.hasNext()) {
      list.add(scanner.next());//读一个单词，以空格分隔
    }

    x = x >> 1;//>>运算符优先级大于^ 从左向右结合

    int[] arr = new int[5];
    PrintWriter out = new PrintWriter("myfile.txt", "UTF-8");//要处理异常，在main中加入throws ioException
    out.println(2);
    Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF_8");
    int t = in.nextInt();
    BigDecimal bigDecimal = BigDecimal.valueOf(d);
    bigDecimal.add(BigDecimal.TEN);
    for (String ss : list) {
      arr[min++] = ss.length();
    }
    Arrays.sort(arr);
    int[] newarr = Arrays.copyOf(arr, arr.length * 2);
    int[][] mularr = new int[5][];//不规则数组先声明行数
    mularr[0] = new int[1];
    mularr[1] = new int[2];
    for (int i = 0; i < mularr.length; i++) {
      for (int j = 0; j < mularr[i].length; j++) {
        min = x ^ t;
      }
    }
    Student student = new Student(11, "xiaoming", LocalDate.now());
    LocalDate localDate = LocalDate.of(1997, 3, 14);
    LocalDate newTime = localDate.plusDays(100);//返回新的变量，原来的不改变
  }
   List<StuSon> stuSons=new ArrayList<>(3);
  enum Size {
    A("a"), B("b"), C("c");
    private String string;
     Size(String str){
      this.string=str;
    }
    public String getStr(){
       return this.string;
    }
  }//内部枚举
}

class Student {

  private static int id = 1;
  private int age=0;
  private final String name;
  private LocalDate localDate;

  Student(int age, String name, LocalDate localDate) {
    this.age = age;
    this.name = name;
    this.localDate = localDate;
  }
  Student( String name, LocalDate localDate) {

    this.name = name;
    this.localDate = localDate;
  }
  public static void setId(){
    id++;
  }

}
class StuSon extends Student{
  StuSon(int age, String name, LocalDate localDate){
    super(age,name,localDate);
  }
}