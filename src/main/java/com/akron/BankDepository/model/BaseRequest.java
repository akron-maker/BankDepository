package com.akron.BankDepository.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <P>
 * 请求参数信息基类
 * </p>
 */
@Data
public class BaseRequest {

	@ApiModelProperty("请求业务流水号")
	private String requestNo;

	@ApiModelProperty(value = "应用编码")
	private String appCode;
}
