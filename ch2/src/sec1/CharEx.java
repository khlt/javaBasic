package sec1;

public class CharEx {

	public static void main(String[] args) {
		// char 타입의 변수 활용
		char c1 = 'K';
		char c2 = 'k';
		char c3 = 97;	// 아스키코드(8bit)(256문자밖에 표시 못함<키보드>) 번호가 
//						대입되는 것이므로 그 코드번호에 해당하는 문자가 대입됨.
		byte c4 = 97;
		char c5 = '김';
		
		// char로 유니코드 쓰는법
		char c6 = '\uac00';	//유니코드(UTF-8)=(16bit)=(2byte)
//							"역슬래시u" ac는 유니코드에서 한글.
		
		int uni1 = c1;
		int uni2 = c5;
		
		System.out.println("c1==c2 : "+(c1==c2));
		System.out.println("c3 = " +c3);
		System.out.println("c4="+c4);
		System.out.println("c5 = "+c5);
		System.out.println("c6 = "+c6);
		System.out.println("c1 유니코드번호 : "+uni1);
		System.out.println("c2 유니코드번호 : "+uni2);
	}

}
