package com.inhatc.mojuk.board.vo;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {

	private String toc_bno; 
	private String toc_belong;
	private String toc_title;
	private String toc_original_file_name;
	private String toc_stored_file_name;
	private String toc_file_size;
	private String toc_content;
	private String toc_writer;
	private String toc_regdate;
	
	
	public String getToc_belong() {
		return toc_belong;
	}
	public String getToc_bno() {
		return toc_bno;
	}
	public void setToc_bno(String toc_bno) {
		this.toc_bno = toc_bno;
	}
	public void setToc_belong(String toc_belong) {
		this.toc_belong = toc_belong;
	}
	public String getToc_title() {
		return toc_title;
	}
	public void setToc_title(String toc_title) {
		this.toc_title = toc_title;
	}
	public String getToc_content() {
		return toc_content;
	}
	public void setToc_content(String toc_content) {
		this.toc_content = toc_content;
	}
	
	public String getToc_original_file_name() {
		return toc_original_file_name;
	}
	public void setToc_original_file_name(String toc_original_file_name) {
		this.toc_original_file_name = toc_original_file_name;
	}
	public String getToc_stored_file_name() {
		return toc_stored_file_name;
	}
	public void setToc_stored_file_name(String toc_stored_file_name) {
		this.toc_stored_file_name = toc_stored_file_name;
	}
	public String getToc_writer() {
		return toc_writer;
	}
	public void setToc_writer(String toc_writer) {
		this.toc_writer = toc_writer;
	}
	public String getToc_regdate() {
		return toc_regdate;
	}
	public void setToc_regdate(String toc_regdate) {
		this.toc_regdate = toc_regdate;
	}
	public String getToc_file_size() {
		return toc_file_size;
	}
	public void setToc_file_size(String toc_file_size) {
		this.toc_file_size = toc_file_size;
	}
	
	
}
