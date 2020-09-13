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
 * 业主服务
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhCustomerService implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 房间编号
     */
    private Integer cellId;

    /**
     * 申请人姓名
     */
    private String proposer;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 诉求时间
     */
    private LocalDateTime appealDate;

    /**
     * 诉求事项
     */
    private String appealEvent;

    /**
     * 状态
     */
    private String status;

    /**
     * 服务类型
     */
    private Long serviceType;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 标识
     */
    private String identify;

    /**
     * 审批人
     */
    private String checkPerson;

    /**
     * 审批时间
     */
    private LocalDateTime checkDate;

    /**
     * 审批意见
     */
    private String checkAdvice;

    /**
     * 服务费用
     */
    private Double serviceMoney;

    /**
     * 回访人
     */
    private String returnVisitPerson;

    /**
     * 回访时间
     */
    private LocalDateTime returnVisitDate;

    /**
     * 是否满意
     */
    private String isSatisfy;

    /**
     * 业主评价
     */
    private String customerEvaluate;

    /**
     * 参考附件
     */
    private String referAttach;


}
