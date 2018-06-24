package com.optimal.kdm.common.utils;

import java.util.List;
import lombok.Data;

@Data
@SuppressWarnings("rawtypes")
public class PageObj<T> {

	public PageObj() {
	}

	public PageObj(int pageSize, int currentPage) {
		this.pageSize = pageSize;
		this.currentPage = currentPage;
	}

	private List items;

	//总记录数
	private long totalCount;

	//总共页数
	private int totalPageCount;

	//每页记录个数
	private int pageSize;

	//当前页数
	private int currentPage;

	//查询索引位置
	private int fromIndex = -1;

}
