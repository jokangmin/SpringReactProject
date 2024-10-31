package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import board.bean.BoardDTO;
import board.service.BoardService;

//@CrossOrigin(origins = "http://localhost:3000/", allowCredentials = "true")
@CrossOrigin
//@Controller

//이것을 사용하면 @ResponseBody 를 매 매핑마다 적어줄 필요가 없다. 브라우저로 바로 띄어주기 때문이다.
@RestController

@RequestMapping(value="board")
public class BoardController {
	
	@Autowired
    private BoardService boardService;
	
	@RequestMapping(value="boardList", method=RequestMethod.GET)
	public List<BoardDTO> boardList() { //List<BoardDTO> 객체를 자동으로 JSON 배열로 변환하여 보낸다.
		List<BoardDTO> boardList = boardService.boardList();
		
		return boardList;
	}
	
	@RequestMapping(value="boardWrite", method=RequestMethod.POST)
	public void boardWrite(@RequestParam String id, @RequestParam String subject, @RequestParam String content) {
		boardService.boardWrite(id, subject, content);
	}
	
	@RequestMapping(value="boardView", method=RequestMethod.GET)
	public BoardDTO boardView(@RequestParam int seq) {
		BoardDTO boardDTO = boardService.boardView(seq);
		
		return boardDTO;
	}
}
