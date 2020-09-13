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
 * 业主服务_办理进度
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhCsHandleSpeed implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 服务单id
     */
    private Integer serviceId;

    /**
     * 办理人
     */
    private String transactorName;

    /**
     * 办理时间
     */
    private LocalDateTime transactorDate;

    /**
     * 办理内容
     */
    private String transactorContent;

    /**
     * 记录人id
     */
    private String recorderId;

    /**
     * 记录人名称
     */
    private String recorderName;

    /**
     * 记录时间
     */
    private LocalDateTime recorderDate;


}
