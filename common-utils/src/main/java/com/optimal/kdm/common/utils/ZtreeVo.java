package com.optimal.kdm.common.utils;

import java.util.List;
import lombok.Data;

@Data
public class ZtreeVo {

	private Long id;

	private Long pId;

	private String temp = "";

	private String name;

	// 是否打开节点
	private boolean open = false;

	// 是否是父节点
	private boolean isParent = false;

	// 复选框是否选择
	private boolean checked = false;

	// 是否展示复选框
	private boolean nocheck = false;

	// 设置节点的 checkbox / radio 是否禁用
	private boolean chkDisabled = false;

	// 类型
	private String type;

	private List children;

	// 排序
	private Integer sort;
	
}
