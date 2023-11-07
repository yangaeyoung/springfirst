package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor //추가하면 BoardService의 객체 주소값이 들어오게 됨
public class BoardController {

    private final BoardService service;

    @GetMapping("/board")
    public List<BoardVo> getBoard(){
        return service.getBoard();
    }

}
