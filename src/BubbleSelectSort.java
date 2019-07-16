public class BubbleSelectSort {
    // 选择排序
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                    // swap(arr,x,y)
                }
            }
        }
    }


    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int x=0; x<arr.length-1; x++)
        {
            for (int y=0; y<arr.length-x-1; y++)
            {
                if(arr[y]<arr[y+1])
                {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                    // swap(arr,y,y+1)
                }
            }
        }
    }


    // 位置互换功能，可以把相同的代码提取出来，单独封装成一个函数。
    public static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    // 打印数组
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


    public static void main (String[]args)
    {
        int[] arr = new int[]{5, 1, 6, 4, 2, 8, 9};
        // 排序前
        printArray(arr);
        // 排序
        selectSort(arr);
        // 排序后
        printArray(arr);

    }
}
