package sec1;

public class Car {
//name 자동차
	//company 제작사
	//fuel 연료
	//tire 바퀴 수
	//speed 속도
	//num 차량번호
	//usetime 주차시간
	
	//생성자 : this() 또는 매개변수를 다양하게 두 가지 방법 중 본인이 편한 것으로
	private String name;
	private String style;
	private String company;
	private String fuel;
	private int tire;
	private int speed;
	private int usetime;
	
	Car() {
		this("차");
	}

	Car(String name) {
		this(name,"경차");
	}
	Car(String name, String style) {
		this(name,style,"현대");
	}
	Car(String name, String style, String company) {
		this(name,style,company,"휘발유");
	}
	Car(String name, String style, String company,String fuel) {
		this(name,style,company,fuel,4);
		}
	Car(String name, String style, String company, String fuel, int tire) {
		this(name,style,company,fuel,tire,0);
		}
	Car(String name, String style, String company, String fuel, int tire, int speed) {
	this(name,style,company,fuel,tire,speed,0);
	}
	
	Car(String name, String style, String company, String fuel, int tire, int speed, int usetime) {
		this.name = name;
		this.style = style;
		this.company = company;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.usetime = usetime;
	}
	public void
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getUsetime() {
		return usetime;
	}

	public void setUsetime(int usetime) {
		this.usetime = usetime;
	}
	
	
}