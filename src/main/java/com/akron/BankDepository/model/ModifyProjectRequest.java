package com.akron.BankDepository.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <P>
 * 更新标的状态请求信息
 * </p>
 */
@Data
@ApiModel(value = "ModifyProjectRequest", description = "更新标的状态请求信息")
public class ModifyProjectRequest extends BaseRequest{

	@ApiModelProperty("标的号")
	private String projectNo;

	@ApiModelProperty("更新标的状态")
	private String projectStatus;
}
