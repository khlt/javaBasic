package ex1;

public class Ex07 {

	public static void main(String[] args) {
		// 주어진 배열의 항목에서 최대값을 구해보세요(for문을 이용하세요).
		int max = 0;
		int[] array = {1,5,3,8,2};
		int j=0;
		
		for(int i=0;i<array.length;i++) {
			
			
			if(j<array[i]) {
				j= array[i];
				
			}
		max=j;
		}
		System.out.println("max: "+ max);
		

	}

}