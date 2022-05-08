package com.akron.BankDepository.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * <P>
 * 放款确认请求返回信息
 * </p>
 */
@Data
@ApiModel(value = "ConfirmRepaymentResponse", description = "放款确认请求返回信息")
public class ConfirmRepaymentResponse extends BaseResponse {

}
