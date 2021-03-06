package com.akron.BankDepository.interceptor;

import com.akron.BankDepository.common.util.RSAUtil;
import com.akron.BankDepository.common.util.ResponseUtil;
import com.akron.BankDepository.entity.RequestDetails;
import com.akron.BankDepository.service.RequestDetailsService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <P>
 * 统一拦截本地请求信息
 * </p>
 */
@Slf4j
@Component
public class LocalRequestInterceptor implements HandlerInterceptor {

	@Value("${depository.privateKey}")
	private
	String depositoryPrivateKey;

	@Autowired
	private RequestDetailsService requestDetailsService;

	@Override
	public boolean preHandle(HttpServletRequest httpRequest, HttpServletResponse httpResponse, Object handler)
			throws Exception {
		RequestDetails requestDetails = requestDetailsService.getByRequestNo(httpRequest.getParameter("requestNo"));
		//请求已被处理，直接返回处理结果
		if (requestDetails != null && StringUtils.isNotBlank(requestDetails.getResponseData())) {
			JSONObject responseJSON = new JSONObject();
			responseJSON.put("respData", JSON.parseObject(requestDetails.getResponseData()));
			responseJSON
					.put("signature", RSAUtil.sign(requestDetails.getResponseData(), depositoryPrivateKey, "utf-8"));
			ResponseUtil.responseOut(httpResponse, responseJSON.toJSONString());
			return false;
		}

		return true;
	}

}
