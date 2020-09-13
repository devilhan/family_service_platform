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
 * 系统日志
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblSystemLog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 日志内容
     */
    private String logContent;

    /**
     * 模块编码
     */
    private String modelId;

    /**
     * ip地址
     */
    private String ipAddr;

    /**
     * 部门权限
     */
    private String deptPrivileges;

    /**
     * 操作人编码
     */
    private String operateId;

    /**
     * 操作人名称
     */
    private String operateName;

    /**
     * 部门编码
     */
    private String deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;


}
