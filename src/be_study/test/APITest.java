package be_study.test;

import java.util.List;

public class APITest {

	public static void main(String[] args) throws Exception {
		
		// 1. API 요청하기 -> String Text 응답 받기
		// DAO / Repository
		
		VilageFcstInfoServiceRepository repository = new VilageFcstInfoServiceRepository();
//		repository.requestApi_getVilageFcst("20260116", "0500");
		
//		// 2. 응답받은 Text (JSON 포맷) -> JSON 파싱 -> DTO 
//		// DTO
		List<VilageFcstDTO> vilageFcstList1 = repository.getVilageFcst("20260116", "0500");
//		
//		// 3. DTO -> DAO -> DB에 저장
//		// DAO
		VilageFcstInfoServiceDAO dao = new VilageFcstInfoServiceDAO();
		int result = dao.saveVilageFcstList(vilageFcstList1);
		if(result > 0) {
			System.out.println("vilageFcstDTO1 정보 저장 성공~" + result);
		}
		
		// 2. 응답받은 Text (JSON 포맷) -> JSON 파싱 -> DTO 
//		// DTO
		List<VilageFcstDTO> vilageFcstList2 = repository.getVilageFcst("20260115", "0500");
		
		// 3. DTO -> DAO -> DB에 저장
//		// DAO
		result = dao.saveVilageFcstList(vilageFcstList2);
		if(result > 0) {
			System.out.println("vilageFcstDTO2 정보 저장 성공~" + result);
		}
	}

}
