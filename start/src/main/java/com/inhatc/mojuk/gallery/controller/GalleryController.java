package com.inhatc.mojuk.gallery.controller;

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
public class GalleryController {

	private static final Logger logger = LoggerFactory.getLogger(GalleryController.class);

	@Autowired
	private BoardService service;

	/* board main */
	@RequestMapping(value = "/gallery.do", method = RequestMethod.GET)
	public String toc_boardMain(@ModelAttribute("cri") Criteria cri, BoardVO vo, Model model, HttpSession ses)
		throws Exception {

			logger.info("Welcome toc_board!");
			logger.info(cri.toString());
	
	
			return "gallery/index";
	}

	
}
