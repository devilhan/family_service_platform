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
 * 执勤管理
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyDutyManage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 执勤日期
     */
    private LocalDateTime dutyDate;

    /**
     * 执勤人
     */
    private String dutyPerson;

    /**
     * 执勤类型
     */
    private String dutyType;

    /**
     * 执勤地点
     */
    private String dutyPlace;

    /**
     * 执勤记录
     */
    private String dutyRecord;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
