package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        for(int i=0;i<20;i++){
            arrayList.add('A');
        }
        System.out.println(String.valueOf(arrayList));
        System.out.println(arrayList);
    }
}
