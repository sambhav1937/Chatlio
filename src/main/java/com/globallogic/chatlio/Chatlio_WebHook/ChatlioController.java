package com.globallogic.chatlio.Chatlio_WebHook;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatlioController {

	
	@RequestMapping(value = "/v1/transcipt", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void postTranscript(@RequestBody Object obj) {
		System.out.println("Hello ---- Chatlio");
		System.out.println(obj);
	}
	
}
