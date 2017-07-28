/** <a href="http://www.cpupk.com/decompiler">Eclipse Class Decompiler</a> plugin, Copyright (c) 2017 Chen Chao. **/
package com.gewara.web.util;

public class PageInfo {
	private String url;
	private String pageNo;
	private boolean prePage;
	private boolean currentPage;
	private boolean nextPage;
	private int realPageNo;

	public boolean isCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(boolean currentPage) {
		this.currentPage = currentPage;
	}

	public boolean isPrePage() {
		return this.prePage;
	}

	public void setPrePage(boolean prePage) {
		this.prePage = prePage;
	}

	public boolean isNextPage() {
		return this.nextPage;
	}

	public void setNextPage(boolean nextPage) {
		this.nextPage = nextPage;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public int getRealPageNo() {
		return this.realPageNo;
	}

	public void setRealPageNo(int realPageNo) {
		this.realPageNo = realPageNo;
	}
}