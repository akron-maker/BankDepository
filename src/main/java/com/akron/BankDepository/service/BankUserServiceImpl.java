package com.akron.BankDepository.service;

import com.akron.BankDepository.entity.BankUser;
import com.akron.BankDepository.mapper.BankUserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 银行用户信息表 服务实现类
 * </p>
 */
@Slf4j
@Service
public class BankUserServiceImpl extends ServiceImpl<BankUserMapper, BankUser> implements BankUserService {

	@Override
	public BankUser getUser(String fullname, String idNumber) {
		return getOne(new QueryWrapper<BankUser>().lambda().eq(BankUser::getFullname, fullname)
				.eq(BankUser::getIdNumber, idNumber), false);
	}
}
