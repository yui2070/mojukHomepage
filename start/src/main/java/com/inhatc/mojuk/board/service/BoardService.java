package com.inhatc.mojuk.board.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.transaction.annotation.Transactional;
import com.inhatc.mojuk.board.vo.BoardVO;
import com.inhatc.mojuk.board.vo.Criteria;

@Transactional
public interface BoardService{
	
	public List<BoardVO> listAll(BoardVO board, Criteria cri, HttpSession ses) throws Exception;
	
	public int listCountCriteria(Criteria cri, HttpSession ses) throws Exception;
	

	public Map<String, Object> read(Integer bno) throws Exception;

	public void regist(BoardVO board,HttpServletRequest request) throws Exception;
	
}