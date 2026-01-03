package stringmanipulation;

import models.Conversion;
import com.google.gson.Gson;
import java.io.IOException;
import com.google.gson.GsonBuilder;
import requesthttp.AskApi;

public class JSONManipulation {
	
	public String prettyConvertApi(String cur1, String cur2, double amount) throws IOException
	{	AskApi api = new AskApi();
		String response = api.getCurrency(cur1, cur2, amount);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Conversion conversion = gson.fromJson(response, Conversion.class);
		double result = conversion.conversionResultString();
				
		String messageString = """
				=== %s to %s ===
				%.2f %s = %.2f %s
				""".formatted(cur1,cur2,amount,cur1,result,cur2);
		//return "%.2f %s = %.2f %s".formatted(amount, cur1, result, cur2);
		
		return messageString;
		
		
	}
}

