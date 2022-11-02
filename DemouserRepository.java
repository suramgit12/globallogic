package com.gl.cryptoUsers.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gl.cryptoUsers.bean.Demouser;

public interface DemouserRepository extends JpaRepository<Demouser,String> {
	Optional<Demouser> findUserByUsername(String username);
}
