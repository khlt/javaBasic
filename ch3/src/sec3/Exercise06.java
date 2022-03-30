package sec3;

public class Exercise06 {

	public static void main(String[] args) {
		//사다리꼴의 넓이를 윗변과 밑변의 길이와 높이를 이용하여 구하는 공식이다. 
		//두 길이의 합과 높이의 곱의 1/2가 사다리꼴의 넓이가 된다.
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (((lengthTop+lengthBottom)*height)/2);
		System.out.println(area);
		// (double)(lengthTop + lengthBottom) /2 * height

	}

}
