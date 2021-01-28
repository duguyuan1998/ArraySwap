package com.duguyuan;

public class ArraySwap {

    public static void swap(int[] array) {
        int maxIndex = 0;
        int minIndex = 0;
        int length = array.length;
        for (int i = 1; i < length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        // 最大元素与第一个元素交换位置
        array[0] = array[0] ^ array[maxIndex];
        array[maxIndex] = array[0] ^ array[maxIndex];
        array[0] = array[0] ^ array[maxIndex];
        // 最小元素与最后一个元素交换位置
        array[length-1] = array[length-1] ^ array[minIndex];
        array[minIndex] = array[length-1] ^ array[minIndex];
        array[length-1] = array[length-1] ^ array[minIndex];
    }

    public static void arrayPrint(int[] array) {
        System.out.print(array[0]);
        for (int i = 1; i <array.length; i++) {
            System.out.print("," + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 9, 8, 0, 4, 6, 7};
        swap(array);
        arrayPrint(array);
    }

}
