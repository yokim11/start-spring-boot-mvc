package com.example.persistent;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.board.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
	public List<Board> findByTitle(String title);
	public Collection<Board> findByWriter(String writer);
	public Collection<Board> findByWriterContaining(String string);
}
