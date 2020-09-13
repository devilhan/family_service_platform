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
 * 租赁分租信息
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhRentShare implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属合同编号
     */
    private Integer contractId;

    /**
     * 租户名称
     */
    private String rentName;

    /**
     * 分租人
     */
    private String shareRentPerson;

    /**
     * 分租房间id
     */
    private String shareCellId;

    /**
     * 分租房间名称
     */
    private String shareCellName;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 起始日期
     */
    private LocalDateTime startDate;

    /**
     * 截止日期
     */
    private LocalDateTime stopDate;

    /**
     * 经营范围
     */
    private String saleRange;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作人id
     */
    private String operateId;

    /**
     * 操作人名称
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;

    /**
     * 修改人id
     */
    private String updatePersonId;

    /**
     * 修改人名称
     */
    private String updatePersonName;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 修改原因
     */
    private String updateReason;


}
