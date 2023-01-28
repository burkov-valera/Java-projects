
//Вычисление величины Sin(x)

 package forms;

public class sin_print_Form2 extends Form2 {

     int a = -27;
     int a0 = 0;
     int i = -1;
     int a2 = 0;
     int da = 27; // Интервал в градусах
    // Конструктор класса sin_print_Form2
    sin_print_Form2() {
        // Конструктор класса Form2
        super("Вычисление величины Sin(x)", 50, 50, 500, 655);
    }
  @Override
  public void funs(){

     //-------------------------Ваш код----------------------------------------
           clear();
      //код программы



      // Начальный угол
      if (i<0) {a0 = a + da;}
      else if (i>=0) {a0 = a2;}
      i++;
      a2 = a0 + da; // Конечный угол
      double rad;
      int z = 0;
      double y;
      // создание отформатированной строки
      String str0 =  String.format("\nВычисление величины Sin(x) в пределах [%d, %d] градусов\n\n", a0, a2);
      add_text(str0);    // вывод информационной строки
      while (a0<=a2){
          if (z > 9) {add_text("\n"); z = 0;}  // пустая строка после 10 значений
          rad = Math.toRadians(a0);    //перевод градусов в радианы
          y = Math.sin(rad);                // вычисление sin(x)
          if (Math.abs(y)<0.000001) {y = 0;}             // задать точность нуля
          String str =  String.format("Sin(" + a0 + ") = %.5f\n", y); // создание отформатированной строки
          add_text(str);    // вывод данных
          a0++;   // следующее число
          z++;
      }

     //------------------------------------------------------------------------

    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new sin_print_Form2();
            }
        });
    }

}
