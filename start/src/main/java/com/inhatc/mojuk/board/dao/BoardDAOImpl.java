package com.inhatc.mojuk.board.dao;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inhatc.mojuk.board.vo.BoardVO;
import com.inhatc.mojuk.board.vo.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Autowired
	private SqlSession session;
	
	private static String namespace="com.inhatc.mapper.toc_BoardMapper";
	
	
	@Override
	public List<BoardVO> listAll(Criteria cri) throws Exception{
		System.out.println("(톡 게시판)DAO당");
		
		return session.selectList(namespace + ".listAll", cri);
	}
	/*List<BoardVO>: 배열*/
	
	
	@Override
	public int countPaging(Criteria cri) throws Exception{
		
		return session.selectOne(namespace +".countPaging", cri);
	}
	
	@Override
	public void create(BoardVO board) throws Exception{
		session.insert("com.inhatc.mapper.toc_BoardMapper.create",board);
	}
	
	@Override
	public void insertFile(Map<String, Object> map) throws Exception{
		
		session.insert("com.inhatc.mapper.toc_BoardMapper.insertFile", map);
	}
	
	@Override
	public Map<String, Object> read(Integer bno) throws Exception{
		
		return session.selectOne(namespace + ".read", bno);
	}


	@Override
	public String selectbno() throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".selectbno");
		
	}


	@Override
	public List<Map<String, Object>> selectFileList(Integer bno) throws Exception {
		
		return session.selectList(namespace + ".selectFileList", bno);
	}
	
}
	
