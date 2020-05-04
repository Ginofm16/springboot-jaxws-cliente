package com.springboot.jaxws;

import com.springboot.jaxws.springbootjaxws.service.UnWebService;
import com.springboot.jaxws.springbootjaxws.service.UnWebServiceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class SpringbootJaxwsClienteApplication {

	public static void main(String[] args) throws MalformedURLException {
		//SpringApplication.run(SpringbootJaxwsClienteApplication.class, args);
		UnWebServiceService unWebServiceService = new UnWebServiceService(
				new URL("http://localhost:8080/UnWebService?wsdl"),
				new QName("http://service.springbootjaxws.jaxws.springboot.com/",
						"UnWebServiceService")
		);

		UnWebService unWebService = unWebServiceService.getUnWebServicePort();

		System.out.println(unWebService.suma(11.1, 22.2));
	}

}
