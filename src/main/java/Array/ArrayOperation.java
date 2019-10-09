package Array;

public class ArrayOperation {

    /**
     * 1.数组是一段连续的内存
     * 2.数组的引用是数组的开始内存地址
     * 3.数组的寻址公式：a[k]_address = base_address + k * type_size type_size 为数组单个元素占用内存大小
     * 4.二维数组的寻址公式：
     * 5.三维数组的寻址公式：
     */

    public static void main(String[] args) {
        String[] arr1 = new String[]{"zhangsan","lisi"};
        String[] arr2 = new String[3];
        String[] arr3 = {};
        System.out.println(arr3.length);
        String s = "chenshuai";
        System.out.println(s.length());


    }

    /**
     * 找出数组中第二大的元素
     */
    public int secondLargest(int[] arr){
        return 0;
    }


}
