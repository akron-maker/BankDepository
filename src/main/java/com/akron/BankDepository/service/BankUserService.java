package com.akron.BankDepository.service;

import com.akron.BankDepository.entity.BankUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 银行用户信息表 服务类
 * </p>
 */
public interface BankUserService extends IService<BankUser> {

	/**
	 * 根据姓名和ID获取用户信息
	 * @param fullname 姓名
	 * @param idNumber 身份证号
	 * @return
	 */
	BankUser getUser(String fullname, String idNumber);

}
