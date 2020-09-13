package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 预收款管理
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyPreReceive implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 凭证号
     */
    private String voucherNumber;

    /**
     * 房间号
     */
    private Integer cellId;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 金额
     */
    private Double money;

    /**
     * 经手人
     */
    private String handlerPerson;

    /**
     * 收款日期
     */
    private LocalDateTime receiveDate;

    /**
     * 录入人
     */
    private String inputPerson;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 收款方式
     */
    private String receiveMethod;

    /**
     * 数据来源
     */
    private String dataSource;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;


}
