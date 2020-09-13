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
 * 租赁合同变更
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhRentContractChange implements Serializable {

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
     * 变更项目
     */
    private String changeProject;

    /**
     * 原值
     */
    private String oldValue;

    /**
     * 新值
     */
    private String newValue;

    /**
     * 说明
     */
    private String desc;

    /**
     * 变更人
     */
    private String changePerson;

    /**
     * 变更时间
     */
    private LocalDateTime changeDate;


}
