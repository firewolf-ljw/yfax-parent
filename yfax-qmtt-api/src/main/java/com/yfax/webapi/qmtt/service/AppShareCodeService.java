package com.yfax.webapi.qmtt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yfax.webapi.qmtt.dao.AppShareCodeDao;
import com.yfax.webapi.qmtt.vo.AppShareCodeVo;

/**
 * 用户邀请码记录
 * @author Minbo
 */
@Service
public class AppShareCodeService{
	
	protected static Logger logger = LoggerFactory.getLogger(AppShareCodeService.class);
	
	@Autowired
	private AppShareCodeDao dao;
	
	public boolean addAppShareCode(AppShareCodeVo appShareCodeVo){
		try {
			return this.dao.insertAppShareCode(appShareCodeVo);
		} catch (Exception e) {
			logger.error("记录用户邀请码记录异常：" + e.getMessage(), e);
			return false;
		}
	}
	
	public AppShareCodeVo selectAppShareCodeByPhoneNum(String phoneNum) {
		return this.dao.selectAppShareCodeByPhoneNum(phoneNum);
	}
	
}