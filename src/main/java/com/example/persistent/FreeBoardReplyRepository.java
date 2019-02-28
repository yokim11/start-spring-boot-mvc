package com.example.persistent;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.board.FreeBoardReply;

public interface FreeBoardReplyRepository extends CrudRepository<FreeBoardReply, Long>{

}
