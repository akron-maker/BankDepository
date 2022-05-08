package com.akron.BankDepository.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <P>
 * 更新标的状态返回信息
 * </p>
 */
@Data
@ApiModel(value = "ModifyProjectResponse", description = "更新标的状态返回信息")
public class ModifyProjectResponse extends BaseResponse {

	@ApiModelProperty("标的状态")
	private String projectStatus;

	public ModifyProjectResponse(String requestNo) {
		super(requestNo);
	}
}
