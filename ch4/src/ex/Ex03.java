package ex;

public class Ex03 {

	public static void main(String[] args) {
		
		int i, sum = 0;
		
		for(i=3;i<=100;i+=3) {
			sum += i;
			
		}
		System.out.println("3의 배수의 합: "+sum);
		
		int hap=0;
		for(int s=0;s<=100;s+=3) {
			hap+=s;
		}
		System.out.println("3의 배수의 합계 :"+hap);
		
		int tot=0;
		for(int s=1;s<100;s++) {
			if(s%3 ==0) tot=tot+s;
		}
		System.out.println(tot);
	}

}
