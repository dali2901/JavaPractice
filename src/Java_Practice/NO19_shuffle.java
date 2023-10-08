package Java_Practice;

import java.util.Random;

public class NO19_shuffle {

public static int[] shuffle(int[] array){

int currentIndex = array.length-1;
while(currentIndex>0){
    // 隨機產生一個 index i
    Random random = new Random();
    int i = random.nextInt(currentIndex-0+1)+0;

    //swap currentIndex and i
    int temp = array[currentIndex];
    array[currentIndex] = array[i];
    array[i] = temp;

    currentIndex--;
}

return array;
}



    public static void main(String[] args) {
        int[] array = {5, 2, 34, 4, 6, 677, 12, 45, 15, 21, 1234, 612, 778, 303, 132, 245, 677};
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("========================");
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("========================");
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
