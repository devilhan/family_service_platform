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
 * 房间加建信息
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FcCellAddbuild implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属房间id
     */
    private Integer cellId;

    /**
     * 加建面积
     */
    private Double addbuildArea;

    /**
     * 加建时间
     */
    private LocalDateTime addbuildTime;

    /**
     * 加建状态
     */
    private String addbuildState;

    /**
     * 加建说明
     */
    private String addbuildDesc;

    /**
     * 加建附件
     */
    private String addbuildAccessory;

    /**
     * 操作人
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;


}
