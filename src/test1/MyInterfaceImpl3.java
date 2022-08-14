package test1;

import java.util.ArrayList;
import java.util.List;

public class MyInterfaceImpl3 implements MyInterface {
    @Override
    public void print() {

    }

    @Override
    public void saySomething() {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("123");
        list.forEach(a->System.out.println(a));
    }
    public static void main(String[] args) {
        MyInterfaceImpl3 myInterface3 = new MyInterfaceImpl3();
        myInterface3.saySomething();
    }
}
