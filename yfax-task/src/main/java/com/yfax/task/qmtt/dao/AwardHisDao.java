package com.yfax.task.qmtt.dao;

import java.util.List;
import java.util.Map;

import com.yfax.task.qmtt.vo.AwardHisVo;

public interface AwardHisDao {
	public boolean insertAwardHis(AwardHisVo awardHisVo) throws Exception;
	public List<AwardHisVo> selectAwardHisByPhoneNum(String phoneNum);
	public AwardHisVo selectAwardHisIsCheckIn(Map<String, Object> map);
	public Long selectUserTotalOfGold(Map<String, Object> map);
}
