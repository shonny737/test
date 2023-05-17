package Lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static Lesson12.BubbleSort.bubbleSort;

public class CompareSort {
    public static void main(String[] args) {

        int[] array = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        long start = System.currentTimeMillis();

        bubbleSort(array);

        long end = System.currentTimeMillis();
        System.out.println("Время сортировки пузырьком: " + (end - start) + " мс");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(rand.nextInt(10000));
        }

        start = System.currentTimeMillis();
        Collections.sort(arrayList);
        end = System.currentTimeMillis();
        System.out.println("Время сортировки методом Collections.sort(): " + (end - start) + " мс");
    }
}
