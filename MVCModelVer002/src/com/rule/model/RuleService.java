package com.rule.model;

import java.util.List;

import com.news.model.NewsVO;

public class RuleService {
	private RuleDAO_interface dao;

	public RuleService() {
		dao = new RuleDAO();
	}

	public RuleVO addRule(String ruleName, String ruleCon) {
		RuleVO ruleVO = new RuleVO();

		ruleVO.setRuleName(ruleName);
		ruleVO.setRuleCon(ruleCon);

		dao.insert(ruleVO);

		return ruleVO;
	}

	public RuleVO updateNews(Integer ruleNo, String ruleName, String ruleCon) {

		RuleVO ruleVO = new RuleVO();
		ruleVO.setRuleNo(ruleNo);
		ruleVO.setRuleName(ruleName);
		ruleVO.setRuleCon(ruleCon);

		dao.update(ruleVO);

		return ruleVO;
	}

	public void deleteRule(Integer ruleNo) {
		dao.delete(ruleNo);
	}
	
	public RuleVO getOneMem(Integer ruleNo) {
		return dao.findByPrimaryKey(ruleNo);
	}
	
	public List<RuleVO> getAll() {
		return dao.getAll();
	}
}