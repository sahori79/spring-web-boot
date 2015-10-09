package com.sadd.boot;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {

	/**
	 * A simple 'sanity' GET mapping to check the health of the service.
	 */
	@RequestMapping("/test")
	public String test() {
		String msg = "TestController service is up!<BR/>  Today's date: " + new Date();
		msg += "<P/>pointing to url:<BR/><strong>";
		msg += "</strong><P/>To test:  <BR/>";
		msg += "use POSTMan to: /controller/test <BR/>";
		msg += "enter a Header value of:  Content-Type  application/json <BR/>";
		msg += "select 'raw' button and 'JSON' from dropdown.  Enter the following (with unique customerPurchaseOrderId): <BR/>";
		return msg;
	}

	

}
