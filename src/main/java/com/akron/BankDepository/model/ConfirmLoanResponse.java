package com.akron.BankDepository.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * <P>
 * 放款确认返回信息
 * </p>
 */
@Data
@ApiModel(value = "ConfirmLoanResponse", description = "放款确认返回信息")
public class ConfirmLoanResponse extends BaseResponse {

}
