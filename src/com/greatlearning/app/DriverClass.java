package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearnging.service.NoteCount;
import com.greatlearning.sorting.BubbleSort;

public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations: ");
		int size = sc.nextInt();

		int currency[] = new int[size];

		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			currency[i] = sc.nextInt();
		}

		BubbleSort bubblesort = new BubbleSort();
		bubblesort.bubbleSort(currency);

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		NoteCount notecount = new NoteCount();
		notecount.counting(currency, amount);

		sc.close();
	}

}
