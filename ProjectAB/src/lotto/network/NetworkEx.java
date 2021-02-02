package lotto.network;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class NetworkEx {

	OkHttpClient client = new OkHttpClient();
	String url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=";
	
	public String requestGet(String round) {
		 try {		 
		        OkHttpClient client = new OkHttpClient();
		 
		        Request.Builder builder = new Request.Builder().url(url+round).get();
		 
		        Request request = builder.build();
		        Response response = client.newCall(request).execute();
		        
		        if (response.isSuccessful()) {
		            ResponseBody body = response.body();
		            if (body != null) {
		                //System.out.println("Response:" + body.string());
		                return body.string();
		            }
		        }
		        else {
		            System.err.println("Error Occurred");
		        }
		        
		    } catch(Exception e) {
		        e.printStackTrace();
		    }
		    
		 return "";
	}
	
}
