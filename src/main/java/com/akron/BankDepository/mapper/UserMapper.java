package com.akron.BankDepository.mapper;

import com.akron.BankDepository.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 存管用户信息表 Mapper 接口
 * </p>
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
