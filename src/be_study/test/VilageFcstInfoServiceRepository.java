package be_study.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class VilageFcstInfoServiceRepository {

	// 1. API 요청하기 -> String Text 응답 받기
	// DAO / Repository
	public String requestApi_getVilageFcst(String base_date, String base_time) throws Exception {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=721165d2fd5e42df4a23b761e4ae503eed80e61c9743082e420b2a7dfa55f34b"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(base_date, "UTF-8")); /*‘21년 6월 28일발표*/
        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode(base_time, "UTF-8")); /*05시 발표*/
        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /*예보지점의 X 좌표값*/
        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /*예보지점의 Y 좌표값*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
//        System.out.println(sb.toString());

		return sb.toString(); 
	}

	// 2. 응답받은 Text (JSON 포맷) -> JSON 파싱 -> DTO 
	// DTO
	public List<VilageFcstDTO> getVilageFcst(String searchDate, String base_time) {
		List<VilageFcstDTO> vilageFcstList = null;
		try {

			//api 요청 텍스트 획득

			String jsonString = requestApi_getVilageFcst(searchDate, base_time);


			vilageFcstList = new ArrayList<VilageFcstDTO>();

			//jsonString 파싱
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject)parser.parse(jsonString);
			
			JSONObject body = (JSONObject)((JSONObject)obj.get("response")).get("body");
			JSONArray items = (JSONArray)((JSONObject)body.get("items")).get("item");
			for(int i = 0; i < items.size(); i++) {
				VilageFcstDTO vilageFcstDTO = new VilageFcstDTO();
				JSONObject item = (JSONObject)items.get(i);
				//DTO 저장
				vilageFcstDTO.setBaseDate(item.get("baseDate").toString());
				vilageFcstDTO.setBaseTime(item.get("baseTime").toString());
				vilageFcstDTO.setCategory(item.get("category").toString());
				vilageFcstDTO.setFcstDate(item.get("fcstDate").toString());
				vilageFcstDTO.setFcstTime(item.get("fcstTime").toString());
				vilageFcstDTO.setFcstValue(item.get("fcstValue").toString());
				vilageFcstDTO.setNx(Integer.parseInt(item.get("nx").toString()));
				vilageFcstDTO.setNy(Integer.parseInt(item.get("ny").toString()));
				
				vilageFcstList.add(vilageFcstDTO);
//				System.out.println(vilageFcstDTO.toString());
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vilageFcstList;
	}
}
