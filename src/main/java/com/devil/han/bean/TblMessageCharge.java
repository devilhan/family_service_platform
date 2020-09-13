package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 短信充值单
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblMessageCharge implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 充值单号
     */
    private String chargeNumber;

    /**
     * 充值账户
     */
    private String chargeAccount;

    /**
     * 充值金额
     */
    private Double chargeMoney;

    /**
     * 充值说明
     */
    private String chargeDesc;

    /**
     * 充值人
     */
    private String chargePerson;

    /**
     * 充值日期
     */
    private LocalDateTime chargeDate;


}
