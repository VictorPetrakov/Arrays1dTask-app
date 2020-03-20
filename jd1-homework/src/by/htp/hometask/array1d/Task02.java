package by.htp.hometask.array1d;

//2. В целочисленной последовательности есть нулевые элементы. Создать массив
//из номеров этих элементов

public class Task02 {

	public static void main(String[] args) {
		
		int[] mas = new int []{0, 20, 4, 50, 0, 6, 3};
		
		int count;
		
		count = 0;

		for (int i = 0; i < mas.length; i++) {
			
			if ( mas[i] == 0) {
				
				count = count + 1;
			}
		}
		
		int[] index = new int [count];
		
		int j = 0;
		
		for (int i = 0; i < mas.length; i++) {

			if (mas[i] == 0) {
				
				index[j] = i;
				
				j++;
			}
		}
    
		for (int i = 0; i < index.length; i++) {
		
			System.out.println(index[i]);
		}
	}
}

