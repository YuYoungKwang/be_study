package be_study.api.v2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MidFcstInfoServiceRepository repository = new MidFcstInfoServiceRepository();
		
		MidTaDTO midTaDTO = repository.getMidTa("202601150600", "11B10101");
		System.out.println(midTaDTO);
		MidTaDTO midTaDTO2 = repository.getMidTa("202601150600", "11B20201");
		System.out.println(midTaDTO2);
	}
}
