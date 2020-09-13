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
 * 快捷方式
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblQuick implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 快捷方式名称
     */
    private String quickName;

    /**
     * 链接参数
     */
    private String urlParam;

    /**
     * 程序路径
     */
    private String codePath;

    /**
     * 图标名称
     */
    private String iconName;

    /**
     * 机器名
     */
    private String mechineName;

    /**
     * 公共类型
     */
    private String publicType;

    /**
     * 类别
     */
    private String type;

    /**
     * 创建人
     */
    private String inputRecordPerson;

    /**
     * 创建时间
     */
    private LocalDateTime inputRecordDate;


}
