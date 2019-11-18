import java.util.*;
public class nove {
    private double x,y,dir;//спользуются только в этом классе
        public  nove(double xx,double yy,double d)
        {
            x=xx;y=yy;dir=d;
        }

        public void move(double len)
        {
            x=x+len*Math.cos(dir);
            y=y+len*Math.sin(dir);
        }
        public double getXQ
        {
            return x;
        }
        public double getYQ
        {
            return y;
        }
        public double getDQ
        {
            return dir;
        }
    }
    public class Bus extends nove
    {
        private int people;private double money;
        public  Bus(double xx,double yy,double d)
        {
            super(xx,yy,d);
            people=0;
            money=0;

        }
        public  void move(double len)
        {
            super.move(len);//вызов конструктора базового класса
            money+=people*len;
        }
        public void enter(int n)
        {
            if(n>=0) people +=n;
        }
        public void exit(int n)
        {
            if(n>=0)
                    if(n>=people)people=0;
                else
                    people-=n;
        }
    }


