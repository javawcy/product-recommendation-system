package com.lyu.shopping.sysmanage.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.lyu.shopping.common.dto.PageParam;
import com.lyu.shopping.common.util.PageUtils;

/**
 * 类描述：处理一级分类的请求
 * 类名称：com.lyu.shopping.sysmanage.controller.Category1Controller
 * @author 曲健磊
 * 2018年3月3日.下午1:36:48
 * @version V1.0
 */
@Controller
@RequestMapping(value="/sysmgr/category1")
public class Category1Controller {
	
	/**
	 * 前台页面提示信息的属性名称
	 */
	private static final String FRONT_TIPS_ATTR = "message";
	
	/**
	 * 新增一级分类成功的提示消息
	 */
	private static final String SAVE_CATEGORY1_SUCCESS = "新增一级分类成功";
	
	/**
	 * 新增一级分类失败的提示信息
	 */
	private static final String SAVE_CATEGORY1_FAILED = "新增一级分类失败";
	
	/**
	 * 删除一级分类成功的提示消息
	 */
	private static final String REMOVE_CATEGORY1_SUCCESS = "删除一级分类成功";
	
	/**
	 * 删除一级分类失败的提示消息
	 */
	private static final String REMOVE_CATEGORY1_FAILED = "删除一级分类失败";
	
	/**
	 * 修改一级分类成功的提示消息
	 */
	private static final String UPDATE_CATEGORY1_SUCCESS = "修改一级分类信息成功";
	
	/**
	 * 修改一级分类失败的提示消息
	 */
	private static final String UPDATE_CATEGORY1_FAILED = "修改一级分类信息失败";
	
	/**
	 * 一级分类的分页查询方法
	 */
	private static final String CATEGORY1_QUERY_METHOD_PAGE = "category1Mgr.listCategory1";
	
	
}
