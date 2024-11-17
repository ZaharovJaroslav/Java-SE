public class Task4 {
   /* Можно ли поменять местами содержимое двух объектов типа
    Integer? - НЕТ так как Классы обертки не изменяемые
    */

    public int swapPlaces(int a, int b) {
        System.out.println("до " + a);
        return a = b;

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Task4 task4 = new Task4();
        int result =  task4.swapPlaces(a, b);
        System.out.println("После " + result);
    }


}
