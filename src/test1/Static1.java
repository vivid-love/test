package test1;

class Student {
    static {
        System.out.println("Student 静态代码块");
    }

    {
        System.out.println("Student 构造代码块");
    }

    public Student() {
        System.out.println("Student 构造方法");
    }
}

class StudentTest {
    static {
        System.out.println("StudentTest静态代码块");
    }
    {
        System.out.println("StudentTest 代码块！");
    }
    StudentTest(){
        System.out.println("StudentTest 构造函数！");
    }


    public static void main(String[] args) {

        System.out.println("我是main方法");
        StudentTest studentTest = new StudentTest();

        Student s1 = new Student();
        Student s2 = new Student();
    }
}
