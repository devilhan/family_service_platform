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
 * 业主投诉
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhConsumerComplain implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 房间编号
     */
    private String cellId;

    /**
     * 投诉人
     */
    private String complainPerson;

    /**
     * 投诉电话
     */
    private String complainPhone;

    /**
     * 投诉日期
     */
    private LocalDateTime complainDate;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 接待人
     */
    private String receptionPerson;

    /**
     * 投诉类别
     */
    private String complainType;

    /**
     * 状态
     */
    private String status;

    /**
     * 开始受理人
     */
    private String startAcceptPerson;

    /**
     * 开始受理时间
     */
    private LocalDateTime startAcceptDate;

    /**
     * 受理结果
     */
    private String acceptResult;

    /**
     * 受理完成人
     */
    private String acceptFinishPerson;

    /**
     * 受理完成时间
     */
    private LocalDateTime acceptFinishDate;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 参考附件
     */
    private String referAttach;

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
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;


}
