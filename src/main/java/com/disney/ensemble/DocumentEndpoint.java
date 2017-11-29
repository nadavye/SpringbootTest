package com.disney.ensemble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ensemble.aop.Loggable;

import static org.springframework.http.MediaType.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/documents")
public class DocumentEndpoint {
	
	@Autowired
	private DocumentService documentService;

    @Loggable
	@RequestMapping(method = GET, produces = APPLICATION_JSON_VALUE)
	public List<DocumentDTO> search(@RequestParam("reference") String referenceCriteria) {
		return documentService.search(referenceCriteria);
	}
	
}
