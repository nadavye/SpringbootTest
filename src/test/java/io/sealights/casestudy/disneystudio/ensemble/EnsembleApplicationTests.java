package io.sealights.casestudy.disneystudio.ensemble;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.disney.ensemble.DocumentDTO;
import com.disney.ensemble.DocumentEndpoint;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnsembleApplicationTests {
	
	@Autowired
	private DocumentEndpoint documentsController;

	@Test
	public void contextLoads() {
		assertNotNull(documentsController);
	}

	@Test
	public void searchApi() {
		List<DocumentDTO> data = documentsController.search("abc");
		assertNotNull(data);
		assertTrue(2==data.size());
	}
}
