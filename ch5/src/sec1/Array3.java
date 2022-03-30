package sec1;

public class Array3 {

	public static void main(String[] args) {
		String[] names = {"정우희","권명선","길정훈","김동협","김성민"};
		//5명의 3과목 점수 선언 jum[][]
		int[][] jum = {{100,70,70},{90,77,43},{53,42,64},{43,23,53},{12,41,87}};
		int hap = 0;
		float py = 0.0f;
		int[] tot;
		float[] avg;
		
		//전체총점(hap), 전체평균(py), 과목총점(tot), 과목평균(avg)
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<3;j++) {
				
				hap+=jum[i][j];
				
			}
		}
		
	}
}

