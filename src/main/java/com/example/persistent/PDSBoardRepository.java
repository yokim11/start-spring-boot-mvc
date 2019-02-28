package com.example.persistent;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.board.PDSBoard;

public interface PDSBoardRepository extends CrudRepository<PDSBoard, Long> {

	@Modifying
	@Query("UPDATE FROM PDSFile f set f.pdsfile = ?2 WHERE f.fno = ?1 ")
	public int updateFDSFile(Long fno, String newFileName);

	@Modifying
	@Query("DELETE FROM PDSFile f WHERE f.fno = ?1 ")
	public int deletePDSFile(long fno);

	@Query("SELECT p, count(f) FROM PDSBoard p LEFT OUTER JOIN p.files f " +
			"ON p.pid = f WHERE p.pid > 0 GROUP BY p ORDER BY p.pid DESC ")
	public List<Object[]> getSummary();

}
