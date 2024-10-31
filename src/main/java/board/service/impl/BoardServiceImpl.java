package board.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.bean.BoardDTO;
import board.dao.BoardDAO;
import board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	public BoardDAO boardDAO;

	@Override
	public List<BoardDTO> boardList() {
		
		List<BoardDTO> boardList = boardDAO.boardList();
		
		return boardList;
	}

	@Override
	public void boardWrite(String id, String subject, String content) {
		Map <String, String> map = new HashMap<>();
		
		map.put("id",id);
		map.put("subject",subject);
		map.put("content",content);
		
		boardDAO.boardWrite(map);
		
		boardDAO.refUpdate();
	}

	@Override
	public BoardDTO boardView(int seq) {
		BoardDTO boardDTO = boardDAO.boardView(seq);
		
		return boardDTO;
	}
	
}
