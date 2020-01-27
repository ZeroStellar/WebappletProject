package com.hello.zernil.Hibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long>{

    public UsersEntity findUsersEntityByUsername(String username);

}
