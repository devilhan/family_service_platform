package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工通讯录类别
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblEmployeeContactCategory implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类别名称
     */
    private String categoryName;

    /**
     * 排序号
     */
    private Long orderId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 上级类别id
     */
    private String parentCategoryId;

    /**
     * 标记线
     */
    private String line;

    /**
     * 创建人id
     */
    private String createPersonId;

    /**
     * 创建人名称
     */
    private String createPerson;

    /**
     * 权限字符串
     */
    private String privileges;


}
