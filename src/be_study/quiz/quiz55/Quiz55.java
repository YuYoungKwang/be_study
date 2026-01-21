package be_study.quiz.quiz55;

import java.util.HashMap;
import java.util.Map;

public class Quiz55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant1 = { "leo", "kiki", "eden" };
		String[] completion1 = { "eden", "kiki" };

		String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion2 = { "marina", "josipa", "nikola", "filipa" };

		String[] participant3 = { "mislav", "stanko", "ana", "mislav" };
		String[] completion3 = { "mislav", "stanko", "ana" };

		String result1 = solution(participant1, completion1); // leo
		String result2 = solution(participant2, completion2); // vinko
		String result3 = solution(participant3, completion3); // mislav

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	// 메소드 선언부분
	public static String solution(String[] participant, String[] completion) {
		//TODO 코드 작성
		
		/*
		//1. ArrayList 활용
		// 추가 기능 , 삭제   .add   .remove  중복추가가능
		
		//참가자 인원 -> List 추가
		//완주자 인원 -> List 삭제
		// 1명 남음
		
		List<String> list1 = new ArrayList<String>(List.of(participant));
		List<String> list = new ArrayList<String>();
		for(String p : participant) {
			list.add(p);
		}
		
		System.out.println(list);
		
		for(String c : completion) {
			//list.contains(c);
			list.remove(c);
		}
		
		System.out.println(list);
		
		//참가자 수 - 완주자 수 = 1
		//완주하지 못한 사람 return
		return list.get(0);  //0인덱스 이름  
		*/
		
		/*
		//2. HashSet 활용
		// 완주자 목록 확인 -> 참가자 목록에 있는 이름을 기준으로 한개씩 지우기
		
		Set<String> set = new HashSet<String>();
		for(String s : completion) {
			set.add(s);   
		}
		//set 완주한 사람들 이름 목록
		
		// "eden", "kiki"     //"leo", "kiki", "eden" 
		
		// 								{ "mislav", "stanko", "ana", "mislav" };
		// { "mislav", "stanko", "ana" };
		
		
		//			{ "mislav", "stanko", "ana", "ana","mislav", "mislav"};
		//			{ "mislav", "stanko", "ana", "ana","mislav" };
		// "mislav", "stanko", "ana"
		
		String result = null;
		for(String s : participant) {
			if(set.contains(s)) { //이사람 완주자 목록에 있느냐!
				set.remove(s);
			} else {  //완주자 목록에 없다? -> 완주 못한 사람
				result = s;
				break;
			}
		}
		
		return result;
		*/
		
		
		// 3. HashMap 활용
		// 키 : 값
		
		//  key이름  value 갯수
		Map<String, Integer> map = new HashMap<String, Integer>();
		//Map<String, Integer> map = new HashMap<>();
		
		for(String s : participant) {
			
			//기존에 있으면? 1 + 1 -> 2 갯수 1더하기
			//기존에 없으면? 새로등록   참가자이름 : 숫자1
			
			map.put(s, map.getOrDefault(s, 0) + 1);
			
//			if(map.containsKey(s)) { 
//				//map.put(s, 1);
//				//원래 기존에 있던 값을 수정 -> 해당 키값으로 다시 값 세팅
//				map.put(s, map.get(s) + 1);
//			} else {
//				map.put(s, 1);
//			}
		}
		//참가자들수
		
		for(String s : completion) {
			map.put(s, map.get(s) - 1 );
			
			if(map.get(s) == 0) { //0이면 아예 삭제 
				map.remove(s);
			}
		}
		
		String result = null;
		for(String key : map.keySet()) {
			if(map.get(key) == 1) {
				result = key;
				break;
			}
		}
		
		return result;		
		
	}

}
















 