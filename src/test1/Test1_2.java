package test1;
public class Test1_2 {
    public static void main(String[] args) {
        // 1.定义数组，记录要排序的元素
        int[] arr = {1,69,80,57,13};
        // 2.通过外循环，控制比较的轮数
        for (int i=0;i<arr.length-1;i++){
            // 3.通过内循环，控制每轮比较的次数
            for (int j=0;j<arr.length-1;j++){
                // 4.如果前一个元素比后边的元素大，就交换他们的位置
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // 5.for循环执行结束后，数组就已经排好顺序了，直接打印即可
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
