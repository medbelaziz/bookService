package appTest.endpoint;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "appTest.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}


}