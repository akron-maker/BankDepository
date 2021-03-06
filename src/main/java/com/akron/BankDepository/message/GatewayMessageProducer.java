package com.akron.BankDepository.message;

import com.akron.BankDepository.model.PersonalRegisterResponse;
import com.akron.BankDepository.model.RechargeResponse;
import com.akron.BankDepository.model.WithdrawResponse;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageConst;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <P>
 * 网关接口请求回调通知消息生产者
 * </p>
 */
@Slf4j
@Component
public class GatewayMessageProducer {

	@Resource
	private RocketMQTemplate rocketMQTemplate;

	public void personalRegister(String appCode, PersonalRegisterResponse response) {
		Message<?> message = MessageBuilder.withPayload(JSON.toJSONString(response))
				.setHeader(MessageConst.PROPERTY_KEYS, appCode).build();
		rocketMQTemplate.convertAndSend("TP_GATEWAY_NOTIFY:PERSONAL_REGISTER", message);
	}

	public void recharge(String appCode, RechargeResponse response) {
		Message<?> message = MessageBuilder.withPayload(JSON.toJSONString(response))
				.setHeader(MessageConst.PROPERTY_KEYS, appCode).build();
		rocketMQTemplate.convertAndSend("TP_GATEWAY_NOTIFY:RECHARGE", message);
	}

	public void withdraw(String appCode, WithdrawResponse response) {
		Message<?> message = MessageBuilder.withPayload(JSON.toJSONString(response))
				.setHeader(MessageConst.PROPERTY_KEYS, appCode).build();
		rocketMQTemplate.convertAndSend("TP_GATEWAY_NOTIFY:WITHDRAW", message);
	}

}
