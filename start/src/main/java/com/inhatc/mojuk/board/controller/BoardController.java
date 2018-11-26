package com.inhatc.mojuk.board.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.activation.CommandMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.mojuk.board.service.BoardService;
import com.inhatc.mojuk.board.vo.BoardVO;
import com.inhatc.mojuk.board.vo.Criteria;
import com.inhatc.mojuk.board.vo.PageMaker;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService service;

	/* board main */
	@RequestMapping(value = "/toc_board.do", method = RequestMethod.GET)
	public String toc_boardMain(@ModelAttribute("cri") Criteria cri, BoardVO vo, Model model, HttpSession ses)
		throws Exception {

			logger.info("Welcome toc_board!");
			logger.info(cri.toString());
	
			model.addAttribute("toc_boardList", service.listAll(vo, cri, ses));
	
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(cri);
	
			pageMaker.setTotalCount(service.listCountCriteria(cri, ses));
	
			model.addAttribute("pageMaker", pageMaker);
	
			return "toc_board/toc_board";
	}

	/* board write */
	@RequestMapping(value = "/toc_write.do", method = RequestMethod.GET)
	public String toc_write(BoardVO board, RedirectAttributes rttr) throws Exception {
		logger.info("toc_write ...");
		logger.info(board.toString());
		return "toc_board/toc_write";
	}

	/* board register */
	@RequestMapping(value = "/toc_register.do", method = RequestMethod.POST)
	public void toc_registerPOST(BoardVO board,RedirectAttributes rttr,HttpServletRequest request,HttpServletResponse response) throws Exception {
		logger.info("toc_register ...");
		logger.info(board.toString());
		service.regist(board, request);
		response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<script>alert('등록이 완료되었습니다.'); window.close();</script>");
        out.flush();

	}
	
	/* board read */
	@RequestMapping(value = "/toc_board/toc_read.do", method = RequestMethod.GET)
	public ModelAndView toc_read(@RequestParam("toc_bno") int bno, Model model) throws Exception {
		ModelAndView mv = new ModelAndView("/toc_board/toc_read");
		Map<String,Object> map = service.read(bno);
	    mv.addObject("map", map.get("map")); /*글*/
	    mv.addObject("list", map.get("list")); /*파일*/
	    
		return mv;
	}
	
	
}
