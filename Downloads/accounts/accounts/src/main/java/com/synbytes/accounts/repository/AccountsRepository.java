package com.synbytes.accounts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.synbytes.accounts.model.Accounts;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts,Long> {
	Accounts findByCustomerId(int customerId);
}
