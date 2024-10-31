package board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import board.bean.BoardDTO;

@Mapper
public interface BoardDAO {

	List<BoardDTO> boardList();

	void boardWrite(Map<String, String> map);

	void refUpdate();

	BoardDTO boardView(int seq);

}
