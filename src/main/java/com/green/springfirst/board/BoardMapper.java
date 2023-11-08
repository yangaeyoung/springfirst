package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpDto;
import com.green.springfirst.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // 빈등록까지
public interface BoardMapper {
    int insBoard(BoardInsDto dto);
    List<BoardVo> selBoardList();
    BoardDetailVo selBoardById(int iboard);
    int updBoard(BoardUpDto dto);
    int delBoard(int iboard);
}
