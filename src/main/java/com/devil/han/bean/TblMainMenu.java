package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 主菜单
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblMainMenu implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主菜单编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 主菜单名称
     */
    private String mainMenuName;

    /**
     * 主菜单文件路径
     */
    private String mainMenuUrl;

    /**
     * 主菜单图标
     */
    private String mainMenuIcon;

    /**
     * 主菜单状态
     */
    private String mainMenuStatus;

    /**
     * 菜单key
     */
    private String mainMenuKey;

    /**
     * 排序号
     */
    private Double mainMenuOrder;

    /**
     * 产品id
     */
    private String belongProduct;


}
