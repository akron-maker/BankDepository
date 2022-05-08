package com.akron.BankDepository.service;

import com.akron.BankDepository.entity.Tender;
import com.akron.BankDepository.model.ConfirmLoanResponse;
import com.akron.BankDepository.model.UserAutoPreTransactionRequest;
import com.akron.BankDepository.model.UserAutoPreTransactionResponse;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 投标信息表 服务类
 * </p>
 */
public interface TenderService extends IService<Tender> {

	/**
	 * 投标预授权处理
	 * @param preTransactionRequest
	 * @return
	 */
	UserAutoPreTransactionResponse autoPreTransactionForTender(UserAutoPreTransactionRequest preTransactionRequest);

	/**
	 * 放款确认
	 * @param reqData
	 * @return
	 */
	ConfirmLoanResponse confirmLoan(String reqData);

}
