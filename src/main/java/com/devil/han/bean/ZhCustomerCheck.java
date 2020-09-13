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
 * 业主验房
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhCustomerCheck implements Serializable {

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
     * 验收日期
     */
    private LocalDateTime checkDate;

    /**
     * 确认日期
     */
    private LocalDateTime confirmDate;

    /**
     * 验收项目编号
     */
    private Long checkItemId;

    /**
     * 验收项目名称
     */
    private String checkItemName;

    /**
     * 是否合格
     */
    private String isPass;

    /**
     * 业主意见
     */
    private String consumerAdvice;

    /**
     * 房管员意见
     */
    private String houseKeeperAdvice;

    /**
     * 验收人员
     */
    private String checkPerson;

    /**
     * 备注
     */
    private String remark;

    /**
     * 录入人
     */
    private String inputPerson;

    /**
     * 录入时间
     */
    private LocalDateTime inputDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 验房类型
     */
    private String checkHouseType;


}
