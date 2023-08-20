package com.alejandro_example.restapicruduser.repositories;

import com.alejandro_example.restapicruduser.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
