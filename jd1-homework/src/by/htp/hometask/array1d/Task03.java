package by.htp.hometask.array1d;

import java.util.Random;

//3. Дана последовательность целых чисел а1 а2,..., аn . 
//Выяснить, какое число встречается раньше - положительное или 
//отрицательное. 


public class Task03 {

	public static void main(String[] args) {
		
		int n = 10;
		
		int [] a = new int [n];
		
		Random rand = new Random();
		
		for (int i = 0 ; i < a.length; i++){
			
			a[i] = rand.nextInt(10);
			
		}
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		if (a[0] >= 0) {
				
			System.out.println("Первое число положительное"); 
		}
		else {
			System.out.println("Первое число отрицательное"); 
		}

	}

}
