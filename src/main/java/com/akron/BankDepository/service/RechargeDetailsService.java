package com.akron.BankDepository.service;

import com.akron.BankDepository.entity.RechargeDetails;
import com.akron.BankDepository.model.RechargeRequest;
import com.akron.BankDepository.model.RechargeResponse;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 充值记录表 服务类
 * </p>
 */
public interface RechargeDetailsService extends IService<RechargeDetails> {

	/**
	 * 用户充值
	 * @param rechargeRequest
	 * @return
	 */
	RechargeResponse recharge(RechargeRequest rechargeRequest);

}
