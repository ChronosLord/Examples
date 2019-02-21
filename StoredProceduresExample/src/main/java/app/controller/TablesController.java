package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.service.TableService;

@RestController
public class TablesController {
	
	@Autowired
	TableService tableService;
	
	public TablesController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(path="/findAll/name",produces = "application/json")
	public ResponseEntity<?> findAllName(){
		
		return tableService.findAllFiltersName();
	}
}
