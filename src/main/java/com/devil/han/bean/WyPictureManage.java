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
 * 图纸管理
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyPictureManage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 图纸名称
     */
    private String pictureName;

    /**
     * 图纸类型
     */
    private Long pictureType;

    /**
     * 说明
     */
    private String desc;

    /**
     * 图纸附件
     */
    private String pictureAttach;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 上传人
     */
    private String uploadPerson;

    /**
     * 上传时间
     */
    private LocalDateTime uploadDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;


}
