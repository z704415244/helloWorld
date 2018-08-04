public class Person {

    public void fun(){
        System.out.println("哈哈哈");
    }
    public void fun(int i){
        System.out.println("哈哈哈" + i);
    }
    public void f2(){
        System.out.println("f2");
    }

    public static void main(String[] args) {
        Person p = new A();
        
    }
}

class A extends Person{
    public void f1(){
        System.out.println("af1");
    }
    public void f3(){
        System.out.println("af3");
    }
}
