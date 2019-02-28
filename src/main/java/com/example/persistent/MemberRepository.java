package com.example.persistent;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.member.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {

	@Query("SELECT m.uid, COUNT(p) " + 
			"FROM Member m LEFT OUTER " + 
			"JOIN Profile p ON m.uid = p.member " + 
			"WHERE m.uid = ?1 " + 
			"GROUP BY m ")
	List<Object[]> getMemberWithProfileCount(String string);

	@Query("SELECT m, p " + 
			"FROM Member m LEFT OUTER " + 
			"JOIN Profile p ON m.uid = p.member " + 
			"WHERE m.uid = ?1 " + 
			"AND p.current = true " )
	List<Object[]> getMemberWithProfile(String string);

}
