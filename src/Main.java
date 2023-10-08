import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入陣列長度:");

        int length = scanner.nextInt();
        int[] nums = new int[length];


        for( int i =0 ; i<length; i++){
            System.out.print("請輸入陣列元素");
            nums[i]= scanner.nextInt();
        }

        BubbleSort bubbleSort = new BubbleSort();
        int[ ] sort_nums = bubbleSort.bubble_sort(nums , length );

        System.out.println( "請輸入目標數字");
        int target = scanner.nextInt();


        No35_Search_Insert_Position no35SearchInsertPosition = new No35_Search_Insert_Position();



        int result = no35SearchInsertPosition.searchInsert(sort_nums , target);

        System.out.println(result);



        System.out.print( "{");
        for(int num : sort_nums){
            System.out.print( num+",");
        }
        System.out.print( "}");

        }



    }
