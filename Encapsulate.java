public class Encapsulate {
    public  int field=100;
    protected  int field2=150;
    int field3=200;
    private int field4=250;
    public int getField4(){
        return this.field4;
    }
    public static void main(String[] args){
        new Class2().method1();

    }
}
class Class2 extends Encapsulate{
    public void method1(){
        System.out.print("Значение открытого паблик поля -field1:"+this.field);
        System.out.print("Значение открытого паблик поля -field2:"+this.field2);
        System.out.print("Значение открытого паблик поля -field3:"+this.field3);
        System.out.print("Значение открытого паблик поля -field4:"+this.getField4();
    }
}