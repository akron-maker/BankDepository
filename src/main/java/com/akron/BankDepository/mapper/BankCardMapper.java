package com.akron.BankDepository.mapper;

import com.akron.BankDepository.entity.BankCard;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 银行用户银行卡信息 Mapper 接口
 * </p>
 */
@Repository
public interface BankCardMapper extends BaseMapper<BankCard> {

//	Page<BankCard> queryBankCards(Page page, @Param(value = "card") BankCard bankCard);

}
