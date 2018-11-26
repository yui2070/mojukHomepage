package com.inhatc.mojuk.board.vo;

public class Criteria { //Criteria:�˻�����, �з�����
	//���� �ȸ����� ��. �Ķ���� 2�� �̻� �޵��� �����ϸ� �Ǵµ�, �˻��� ���� ����� �ٰԵǸ� ���� ���޵Ǵ� �Ķ���;��� �������Ƿ� �����ϱ� ����
	
	private Integer page;
	private Integer perPageNum;
	private String manager_belong;

	public Criteria() {
		this.page = 1; //�⺻ �� 1������
		this.perPageNum = 10; //����Ʈ �� �������� ���� 10���� ���� �ο�
	}

	public void setPage(int page) {

		if (page <= 0) {
			this.page = 1;
			return;
		}
		this.page = page;
	}

	public void setPerPageNum(int perPageNum) {

		if (perPageNum <= 0 || perPageNum > 100) {
			this.perPageNum = 10;
			return;
		}

		this.perPageNum = perPageNum;
	}
 // set�޼ҵ�� ����ڰ� ���Ƿ� �߸� �Է��� �� �ִ� ���� ���� �ʿ��� �����͸� ��������
	
	public int getPage() {
		return page;
	}

	public int getPageStart() {
		return (this.page - 1) * perPageNum;
	}

	public int getPerPageNum() { //�� �������� �������� ����
		return this.perPageNum;
	}

	@Override
	public String toString() {
		return "Crtieria [page=" + page + "," + "perPageNum" + perPageNum + "]";
	}

	

	public String getManager_belong() {
		return manager_belong;
	}

	public void setManager_belong(String manager_belong) {
		this.manager_belong = manager_belong;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public void setPerPageNum(Integer perPageNum) {
		this.perPageNum = perPageNum;
	}

	
	
}
