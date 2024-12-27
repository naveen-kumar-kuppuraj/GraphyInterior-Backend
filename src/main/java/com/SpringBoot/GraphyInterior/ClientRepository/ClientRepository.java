package com.SpringBoot.GraphyInterior.ClientRepository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.SpringBoot.GraphyInterior.Entity.Client;
import jakarta.transaction.Transactional;

public interface ClientRepository  extends JpaRepository<Client, Integer>{
	
	@Transactional
	@Modifying
	@Query(value="insert into Client values(?,?,?,?,?)",nativeQuery=true)
	int insertstudent(int id, String name,String mobile,String email,String address,String message);
	

	@Transactional
	@Modifying
	@Query(value="update Client set name=? where id=?",nativeQuery=true)
	int updatestudent(String name,int id);
	
	
	@Transactional
	@Modifying
	@Query(value="delete from Client where id=?",nativeQuery=true)
	int deleteById(int id);
	
	@Query(value="select * from Client where id=?",nativeQuery=true)
	Optional<Client> findById(int id);

}
