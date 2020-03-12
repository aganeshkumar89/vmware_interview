package com.vmware.basic.calculation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.basic.calculation.model.Input;
import com.vmware.basic.calculation.model.Output;

@RestController
@RequestMapping(path = "/api")
public class ManipulationController {

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<?> add(@RequestBody Input input) {
		Output output = new Output();
		output.setResult(input.getValue1() + input.getValue2());
		return new ResponseEntity<Output>(output, HttpStatus.OK);
	}

	@RequestMapping(value = "/diff", method = RequestMethod.POST)
	public ResponseEntity<?> difference(@RequestBody Input input) {
		Output output = new Output();
		output.setResult(input.getValue1() - input.getValue2());
		return new ResponseEntity<Output>(output, HttpStatus.OK);
	}
}
