package board.service;

import java.util.List;

import board.bean.BoardDTO;

public interface BoardService {

	List<BoardDTO> boardList();

	void boardWrite(String id, String subject, String content);

	BoardDTO boardView(int seq);

}
