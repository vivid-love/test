package cast_down;
class AA{
    public void g(){};
    public void f(){};
}
class BB extends AA{
    public  void g(){};
    public void f(){};
    public void u(){};

}

public class Cast_Down  extends BB{
    public static void main(String[] args){
        AA []aa = {
                new AA(),
                new BB()
                        };
        aa[0].f();
        aa[1].f();
//        aa[1].u();
        ((BB)aa[1]).u();//向下转型
        ((BB)aa[0]).u();//AA也可以向下转型
    }

}
