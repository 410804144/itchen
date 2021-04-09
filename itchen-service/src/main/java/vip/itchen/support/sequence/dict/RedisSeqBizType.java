package vip.itchen.support.sequence.dict;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * redis生成序列号的订单类型
 * 根据该类型分开采集序列号
 * @author lhb
 */
@AllArgsConstructor
@Getter
public enum RedisSeqBizType {

    FINANCE_PURCHASE_ORDER_NO( "理财购买订单", RedisSeqFormat.yyMMddHHmm, 5),
    FINANCE_REDEEM_ORDER_NO( "理财赎回订单", RedisSeqFormat.yyMMddHHmm, 5),
    FINANCE_INTEREST_ORDER_NO( "理财分红订单", RedisSeqFormat.yyMMddHHmm, 5),
    GAME_ORDER_NO( "游戏订单", RedisSeqFormat.yyMMddHHmm, 5),
    PAY_ORDER_CODE( "支付订单编号", RedisSeqFormat.yyMMddHHmm, 5),
    WITHDRAW_CODE( "提现编号", RedisSeqFormat.yyMMddHHmm, 5),
    SM_ORDER_CODE("集市订单编号", RedisSeqFormat.yyMMddHHmm, 5),
    SM_MERCHANT_CODE("商家编号", RedisSeqFormat.yyMMddHHmm, 5),
    SM_MERCHANT_SHOP_CODE("商家店铺编号", RedisSeqFormat.yyMMddHHmm, 5),
    ;

    private final String desc;
    /**
     * 时间格式
     */
    private final RedisSeqFormat format;
    /**
     * 统一左补0的位数
     */
    private final Integer padLeftLength;
}
