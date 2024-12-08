package com.suhaas.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suhaas.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
