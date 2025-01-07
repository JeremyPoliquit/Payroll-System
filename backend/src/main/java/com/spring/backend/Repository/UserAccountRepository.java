package com.spring.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.backend.Entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

}
