package com.example.persistent;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.board.FreeBoard;

public interface FreeBoardRepository extends CrudRepository<FreeBoard, Long> {

	List<FreeBoard> findByBnoGreaterThan(long l, Pageable page);

	@Query("SELECT b.bno, b.title, count(r) " +
			" FROM FreeBoard b LEFT OUTER JOIN b.replies r " +
			" WHERE b.bno > 0 GROUP BY b ")
	public List<Object[]> getPage(Pageable page);

}
