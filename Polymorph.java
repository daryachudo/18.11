public class Polymorph {
    void method()
        {
        System.out.println("это был вызван метод суперкласса полиморфизм");
    }
    public static void main(String[] args)
    {
        new NewClass1().method1();
        new NewClass2().method2();
    }
}
    class NewClass1 extends Polymorph
    {
        void  method1(){
            System.out.println("это был вызван метод 5ласса потомка нью класс1");
        }
    }
    class NewClass2 extends Polymorph
    {
        void  method1(){
            System.out.println("это был вызван метод класса потомка нью класс2");
        }
    }

