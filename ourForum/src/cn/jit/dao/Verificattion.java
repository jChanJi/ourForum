package cn.jit.dao;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class Verificattion {
	
public void verification(String verification,String phone) throws ApiException{
		
		String url="http://gw.api.taobao.com/router/rest";
		String appkey="23810239";
		String secret="f9fa02a26d039fefea7432a09ce2cb5a";
		
		TaobaoClient client = new DefaultTaobaoClient(url, appkey,secret);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("123456");
		req.setSmsType("normal");
		req.setSmsFreeSignName("Chanji论坛");
		req.setSmsParamString("{\"number\":\""+verification+"\"}");
	
		req.setRecNum(phone);
		req.setSmsTemplateCode("SMS_66430019");
		AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
		System.out.println(rsp.getBody());
	}
	

	
}
