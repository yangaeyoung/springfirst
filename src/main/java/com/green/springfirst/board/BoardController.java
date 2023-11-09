package com.green.springfirst.board;

import com.green.springfirst.ResVo;
import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpDto;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // 응답 json이 기본 // controller는 html이 기본 응답
@RequiredArgsConstructor //추가하면 BoardService의 객체 주소값이 들어오게 됨
public class BoardController {

    private final BoardService service;

    @PostMapping("/board")// 주소값이 같으나 요청이 get으로 들어왔을 때와 post로 들어왔을 때 구분이 될 수 있음
    @ResponseBody // controller 였으면 이걸 사용
    public ResVo insBoard(@RequestBody BoardInsDto dto){ // json형태로 매핑해서 응답
        int result = service.insBoard(dto);
        return new ResVo(result);
    }// postman-post-body.row.json-내용 입력

    @GetMapping("/board")
    public List<BoardVo> getBoard(){// 테이블 전체를 불러오기 - 매개변수 X
        return service.getBoard();
    }// postman-get-http://localhost:8080/board - body에 테이블 전체 출력

    @GetMapping("/board/{iboard}")
    public BoardDetailVo getBoardDetail(@PathVariable int iboard){// 파라미터 iboard에 {iboard}가 담김
        System.out.println(iboard);
        return service.getBoardDetail(iboard);
    }

    @PutMapping("/board")
    public ResVo putBoard(@RequestBody BoardUpDto dto){
        int result = service.putBoard(dto);
        return new ResVo(result);
    }

    @DeleteMapping("/board/{iboard}")
    public ResVo delBoard(@PathVariable int iboard){
        System.out.println(iboard);
        int result = service.delBoard(iboard);
        return new ResVo(result);
    }
}
