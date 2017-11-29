package io.sealights.casestudy.disneystudio.ensemble;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api/v1/documents")
public class DocumentEndpoint {

	public DocumentEndpoint() {
	}

	@RequestMapping(value = "/something", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getSomething() {
		return "something";
	}
}
