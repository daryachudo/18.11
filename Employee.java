import java.util.*;
abstract class Employee {
public Employee(){}
public abstract double salary();
//ТУТ ТОЖЕ ЕСТЬ ПОЛИМОРФИЗМ
}
class Manager extends Employee//Наследует у базового
{
    public Manager(){}//метод менеджер, конструктор
    public double salary()//конкретный метод начизляет зп не нужны поля т постоянная
    {return 13000;}
}
class Agent extends Employee
    {
        private  double amount;
        public Agent(double a)
        {
            amount=a;
        }
        public double salary()
        {
            return 5000+0.05*amount;
        }
    }
class  Worker extends Employee
    {
        private double time;
        public Worker(double t)
        {
            time=t;
        }
        public double salary()
        {
            return  100*time;
        }
    }
public static void main(String[] args)
{
   Employee[] M=new Employee[9];
    M[0]=new Manager();
    M[1]=new Manager();
    M[2]=new Manager();
    M[3]=new Agent(100000);
    M[4]=new Agent(110000);
    M[5]=new Agent(120000);
    M[6]=new Worker(140);
    M[7]=new Worker(150);
    M[8]=new Worker(160);
    for(i=0;i<9;i++)
        System.out.println("zp "+i+"-ro sotrudnica"+M[i].salary()+" p. ");
}
