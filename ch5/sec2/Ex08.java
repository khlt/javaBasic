package sec2;

public class Ex08 {

	public static void main(String[] args) {
		// 주어진 배열의 전체 항목의 합과 평균값을 구해보세요(중첩 for문을 이용하세요).
		int [][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0;
		double avg = 0.0;
		
		int j=0;
		int lgh=0;
		
		for(int i=0;i<array.length;i++) {
			
			for(j=0;j<array[i].length;j++) {
				sum+=array[i][j];
				
			}
			lgh += array[i].length;
			avg=(double)sum/lgh;
		}
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	
	}

}
