import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		// 최고 점수를 받은 아이디 저장
		int maxScore = 0;		// 최고 점수 저장
		int totalScore = 0;		// 점수 합계 저장
		
		// 작성 위치
		
	}

}

/*
 * HashMap에 아이디(String)와 점수(Integer)가 저장되어 있습니다. 실행 결과와 같이 평균 점수를 출력하고, 최고 점수와
 * 최고 점수를 받은 아이디를 출력해보세요.
 */

// 결과
/*
 * 최고점수: 91 
 * 최고점수: 96 
 * 최고점수를 받은 아이디: blue
 */