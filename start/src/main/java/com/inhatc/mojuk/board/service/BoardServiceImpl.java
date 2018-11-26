package com.inhatc.mojuk.board.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.inhatc.mojuk.board.dao.BoardDAO;
import com.inhatc.mojuk.board.vo.BoardVO;
import com.inhatc.mojuk.board.vo.Criteria;
import com.inhatc.mojuk.core.util.FileUtils;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO dao;

	@Resource(name="fileUtils")
	private FileUtils fileUtils;
	
	@Override
	public List<BoardVO> listAll(BoardVO board, Criteria cri, HttpSession ses) throws Exception {
		
		return dao.listAll(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri, HttpSession ses) throws Exception {
		
		return dao.countPaging(cri);
	}
	

	@Override
	public void regist(BoardVO board, HttpServletRequest request) throws Exception {
		dao.create(board);
		String bno = dao.selectbno();
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
		Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
		MultipartFile multipartFile = null;
		
		while(iterator.hasNext()) {
			multipartFile = multipartHttpServletRequest.getFile(iterator.next());
			if(multipartFile.isEmpty() == false) {
				System.out.println("--------------------- file start ---------------------");
				System.out.println("name: " +multipartFile.getName());
				System.out.println("filename: "+multipartFile.getOriginalFilename());
				System.out.println("size: " +multipartFile.getSize());
				System.out.println("--------------------- file end -----------------------\n");
				
			}
		}
		
		List<Map<String, Object>> list = fileUtils.parseInsertFileInfo(bno ,request);
		System.out.println(list);
		System.out.println(list.get(0));
		for(int i=0, size=list.size(); i<size; i++) {
			dao.insertFile(list.get(i));
			/*['게시물번호','파일이름','파일 사이즈']*/
		}
	}
	
	@Override
	public Map<String, Object> read(Integer bno) throws Exception {
	    Map<String, Object> resultMap = new HashMap<String,Object>();
	    Map<String, Object> tempMap = dao.read(bno);
	    resultMap.put("map", tempMap);
	     
	    List<Map<String,Object>> list = dao.selectFileList(bno);
	    resultMap.put("list", list);

	    return resultMap;
	}
}