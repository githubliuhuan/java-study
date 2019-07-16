public class HalfSearchSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,19,32,45};

        int index = halfSearch(arr,2);
        // int index = halfSearch_2(arr,32);
        System.out.println("index="+index);
    }

    private static int halfSearch(int[] arr, int key) {
        int min,max,mid;
        min = 0;
        max = arr.length-1;
        mid = (min+max)/2;

        while(arr[mid]!=key)
        {
            if(key>arr[mid])
                min = mid + 1;
            else if(key<arr[mid])
                max = mid - 1;

            if(min>max)
                return -1;
            mid = (max+min)/2;
        }
        return mid;
    }

    // 二分查找de的第二种方式
    public static int halfSearch_2(int[] arr,int key)
    {
        int min = 0,max = arr.length-1,mid;

        while (min<=max)
        {
            mid = (min+max)>>1;
            if(key>arr[mid])
                min = mid + 1;
            else if(key<arr[mid])
                max = mid - 1;
            else
                return mid;
        }
        return -1;

    }
}