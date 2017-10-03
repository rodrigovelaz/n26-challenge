package org.rodrigovelaz.n26.challenge.business.service;

import org.rodrigovelaz.n26.challenge.exception.TransactionExpiredException;
import org.rodrigovelaz.n26.challenge.exception.TransactionOutOfFutureWindow;
import org.rodrigovelaz.n26.challenge.persistence.entity.Transaction;
import org.rodrigovelaz.n26.challenge.presentation.json.TransactionPostJson;

public interface TransactionService {
	
	public Transaction process(TransactionPostJson json) throws TransactionExpiredException, TransactionOutOfFutureWindow;

}
