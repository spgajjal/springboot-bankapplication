package com.cap.bankapplication.repository;

public interface BankAccountRepository {
	public double getBalance(long accountId) ;
	public boolean updateBalance(long accountId, double newBalance) ;

}
