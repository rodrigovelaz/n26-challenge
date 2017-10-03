package org.rodrigovelaz.n26.challenge.business.service.impl;

import org.rodrigovelaz.n26.challenge.business.service.StatisticService;
import org.rodrigovelaz.n26.challenge.business.service.TransactionService;
import org.rodrigovelaz.n26.challenge.business.util.DateUtil;
import org.rodrigovelaz.n26.challenge.exception.TransactionExpiredException;
import org.rodrigovelaz.n26.challenge.exception.TransactionOutOfFutureWindow;
import org.rodrigovelaz.n26.challenge.persistence.entity.Transaction;
import org.rodrigovelaz.n26.challenge.presentation.json.TransactionPostJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private StatisticService statisticService;

	@Override
	public Transaction process(TransactionPostJson json) throws TransactionExpiredException, TransactionOutOfFutureWindow {
		
		Transaction transaction = new Transaction();
		transaction.setAmount(json.getAmount());
		transaction.setDate(DateUtil.convertToLocalDateTime(json.getTimestamp()));
		
		this.statisticService.add(transaction);
		
		return transaction;
		
	}
	
}
