package org.rodrigovelaz.n26.challenge.presentation.controller;

import javax.validation.Valid;

import org.rodrigovelaz.n26.challenge.business.service.TransactionService;
import org.rodrigovelaz.n26.challenge.exception.TransactionExpiredException;
import org.rodrigovelaz.n26.challenge.exception.TransactionOutOfFutureWindow;
import org.rodrigovelaz.n26.challenge.persistence.entity.Transaction;
import org.rodrigovelaz.n26.challenge.presentation.json.TransactionPostJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping
	public ResponseEntity<Transaction> post(@RequestBody @Valid TransactionPostJson bodyJson) {

		try {
			Transaction transaction = this.transactionService.process(bodyJson);
			
			ResponseEntity<Transaction> response = new ResponseEntity<Transaction>(transaction, HttpStatus.CREATED);
			return response; 
		} 
		catch (TransactionExpiredException | TransactionOutOfFutureWindow e) {
			return new ResponseEntity<Transaction>(HttpStatus.NO_CONTENT);
		}
	}

}
