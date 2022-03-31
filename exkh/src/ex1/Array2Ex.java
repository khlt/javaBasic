package ex1;

public class Array2Ex {

	public static void main(String[] args) {
		String[] names = {"김태균","김효민","신길호","여승원","이규진"}; 
		//5명의 3과목 점수 선언 jum[][] -> 2차원 배열 행(줄),열(칸)
		int[][] jum = {{100,80,90},{70,90,80},{60,90,80},{90,80,70},{85,95,85}};
		int hap = 0;
		float py = 0.0f;
		int[] tot = new int[3];
		float[] avg = new float[3];
		//전체총점(hap), 전체평균(py), 과목총점(tot), 과목평균(avg)
		/*
		 성명		국어		영어		수학 
		 ---	---		---		---
		 ---	---		---		---
		 **************************
		 총점		XX		XX		XX
		 평균 	XX.X	XX.X	XX.X
		 전체총점 : XXX	전체평균 : XX.X
		 */
		System.out.println("성명\t국어\t영어\t수학");
		for (int i=0;i<names.length;i++) {
			System.out.print(names[i]);
			
			for(int j=0;j<jum[j].length;j++) {
			System.out.print("\t"+jum[i][j]);
			hap+=jum[i][j];
			tot[j]+=jum[i][j];
			
			
		}System.out.println();
		}System.out.println("*********************************");
		System.out.print("총점");
		for (int j=0;j<tot.length;j++) {
	
		System.out.print("\t"+tot[j]);
		
		}System.out.println();
		System.out.print("평균");
		for (int i=0;i<jum[i].length;i++) {
			avg[i]=(float)tot[i]/jum.length;
			System.out.print("\t"+avg[i]);
			
		}System.out.println();
		System.out.print("전체 총점\t"+hap);
		for (int i=0;i<avg.length;i++) {
			py+=avg[i];
			
			
		
	}System.out.println("\t전체평균\t"+py/3);

}
}