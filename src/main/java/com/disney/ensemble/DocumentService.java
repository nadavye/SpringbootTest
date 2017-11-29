package com.disney.ensemble;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class DocumentService {
	
	private List<DocumentDTO> repo = Arrays.asList(
		new DocumentDTO("DOC1"),
		new DocumentDTO("DOC2")
	);

	public List<DocumentDTO> search(String searchBy) {
		return repo;
	}

}
