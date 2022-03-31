package ex1;

public class ScoreProc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"길정훈","김동협","김성민","김태균","신길호"};
		int[][] scores = {{90,75,100},{95,90,65},{80,85,95},{85,80,85},{70,90,80}};
		int tot[] = {0,0,0};
		float[] avg = {0.0f,0.0f,0.0f};
		int total = 0;
		float avarege = 0.0f;
		
		System.out.println("이름\t국어\t영어\t수학");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(scores[i][j]+"\t");
				
				tot[j] += scores[i][j];
			}System.out.print("\n");
		}System.out.print("\n");
		System.out.print("과목별 총점\t");
		for(int i=0;i<3;i++) {
		
			System.out.print(tot[i]+"\t");
		
		}
		
	}

}
