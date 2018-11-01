package com.blog.samples.services;

import org.springframework.stereotype.Service;

import com.blog.samples.webservices.Account;
import com.blog.samples.webservices.EnumAccountStatus;


@Service
public class AccountServiceImpl implements AccountService
{

	public Account getAccountDetails(String accountNumber)
	{


		Account account = new Account();
		account.setAccountNumber("12345");
		account.setAccountStatus(EnumAccountStatus.ACTIVE);
		account.setAccountName("Joe Bloggs");
		account.setAccountBalance(3400);

		return account;
	}
}
