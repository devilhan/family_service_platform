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
 * 物业接管资料明细
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyTakeoverDataDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 接管资料id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属接管id
     */
    private Integer takeoverId;

    /**
     * 资料名称
     */
    private String dataName;

    /**
     * 资料份数
     */
    private Integer dataCopies;

    /**
     * 资料页数
     */
    private Integer dataPages;

    /**
     * 资料分类
     */
    private Long dataType;

    /**
     * 档案号
     */
    private String fileNumber;

    /**
     * 交出人
     */
    private String handoverPerson;

    /**
     * 接收人
     */
    private String receivePerson;

    /**
     * 接受日期
     */
    private LocalDateTime receiveDate;

    /**
     * 备注
     */
    private String remark;


}
