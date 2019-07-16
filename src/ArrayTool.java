/**
 *这是一个可以对数组进行操作的工具类，该类中提供了，获取最值，排序等功能
 *@author huan
 *@version V1.1
 */

public class ArrayTool {
    /**
     *空参数构造函数。
     */
    // 构造函数私有化
    private ArrayTool(){}

    /**
     *
     * @param arr 接收一个int类型的数组。
     * @return 会返回该数组的最大值
     */
    public static int getMax(int[] arr)
    {
        int max = 0;
        for (int x=1; x<arr.length; x++)
        {
            if (arr[x]>arr[max])
                max = x;
        }
        return arr[max];
    }

    /**
     *
     * @param arr 接收一个int类型的数组。
     * @return 会返回该数组的最小值
     */
    public static int getMin(int[] arr)
    {
        int min = 0;
        for (int x=1; x<arr.length; x++)
        {
            if (arr[x]<arr[min])
                min = x;
        }
        return arr[min];
    }


    /**
     *
     * @param arr 给int数组进行选择排序
     */

    public static void selectSort(int[] arr)
    {
        for(int x=0; x<arr.length-1; x++)
        {
            for(int y=x+1; y<arr.length; y++)
            {
                if(arr[x]>arr[y])
                {
                    swap(arr,x,y);
                }
            }
        }
    }

    /**
     *
     * @param arr 给int数组进行冒泡排序
     */
    public static void bubbleSort(int[] arr)
    {
        for (int x=0; x<arr.length-1;x++)
        {
            for (int y=0; y<arr.length-x-1; y++)
            {
                if(arr[x]>arr[y])
                {
                    swap(arr,x,y);
                }
            }
        }
    }

    /**
     *
     * @param arr 数组中两个值进行置换
     */
    private static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    /**
     *
     * @param arr 用于打印数组中的元素
     */
    public static void printArray(int[] arr)
    {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x != arr.length - 1)
                System.out.print(arr[x] + ", ");
            else
                System.out.println(arr[x] + "]");
        }

    }


    public static void main(String[] args) {
        int[] arr = {3, 1, 87, 32, 8};
        int max = ArrayTool.getMax(arr);
        System.out.println("max="+max);
    }
}


