package com.inhatc.mojuk.board.dao;

import java.util.List;
import java.util.Map;

import com.inhatc.mojuk.board.vo.BoardVO;
import com.inhatc.mojuk.board.vo.Criteria;

public interface BoardDAO {
	
	public List<BoardVO> listAll(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;
	
	public void create(BoardVO board) throws Exception;
	
	public void insertFile(Map<String, Object>map) throws Exception;

	public Map<String, Object> read(Integer bno) throws Exception;
	
	public List<Map<String, Object>> selectFileList(Integer bno) throws Exception;

	public String selectbno() throws Exception;
}