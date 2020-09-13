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
 * 车位管理
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyCarSpaceManage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 车位编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 车位类型
     */
    private Long carSpaceType;

    /**
     * 车牌号码
     */
    private String carLicenceId;

    /**
     * 预售价格
     */
    private Double preSalePrice;

    /**
     * 预租价格
     */
    private Double preRentPrice;

    /**
     * 停车证号
     */
    private String stopCarLicence;

    /**
     * 所属楼盘id
     */
    private Integer estateId;

    /**
     * 管理类别
     */
    private String manageType;

    /**
     * 车位位置
     */
    private String carSapcePosition;

    /**
     * 车位面积
     */
    private Double carSapceArea;

    /**
     * 产权人id
     */
    private Integer ownerId;

    /**
     * 产权人名称
     */
    private String ownerName;

    /**
     * 实售价格
     */
    private Double realSalePrice;

    /**
     * 车位类别
     */
    private String carSpaceCategory;

    /**
     * 当前状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 销售人
     */
    private String salePerson;

    /**
     * 销售时间
     */
    private LocalDateTime saleDate;


}
