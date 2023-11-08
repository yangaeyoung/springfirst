package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpDto;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public List<BoardVo> getBoard(){
        return boardMapper.selBoardList();
    }

    public BoardDetailVo getBoardDetail(@PathVariable int iboard){
        return boardMapper.selBoardById(iboard);
    }

    public int insBoard(BoardInsDto dto){
        return boardMapper.insBoard(dto);
    }

    public int delBoard(int iboard){ return  boardMapper.delBoard(iboard);}

    public int putBoard(BoardUpDto dto) {return boardMapper.updBoard(dto);}
}
