package com.akron.BankDepository.service;

import com.akron.BankDepository.entity.WithdrawDetails;
import com.akron.BankDepository.model.WithdrawRequest;
import com.akron.BankDepository.model.WithdrawResponse;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户余额明细表 服务类
 * </p>
 */
public interface WithdrawDetailsService extends IService<WithdrawDetails> {

    /**
     * 用户提现
     * @param withdrawRequest
     * @return
     */
    WithdrawResponse withDraw(WithdrawRequest withdrawRequest);

}
