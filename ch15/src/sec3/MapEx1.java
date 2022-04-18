package sec3;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("김준호", 100);
		map.put("김준호", 100);
		map.put("김준호", 100);
		map.put("김준호", 100);
		map.put("김준호", 100);
		System.out.println("저장된 데이터 건수 : "+map.size());
		System.out.println("김예은의 점수 : "+map.get("김예은"));
		System.out.println("김준호의 점수 : "+map.get("김준호"));
		map.remove("김효민");

	}

}
