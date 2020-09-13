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
 * 业主服务_办理结果
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhCsHandleResult implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属服务单id
     */
    private Integer serviceId;

    /**
     * 办理人id
     */
    private String transactorId;

    /**
     * 办理人名称
     */
    private String transactorName;

    /**
     * 是否负责人
     */
    private String isLeader;

    /**
     * 相关单位
     */
    private String relationCompany;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 开始办理时间
     */
    private LocalDateTime handleStartDate;

    /**
     * 完成办理时间
     */
    private LocalDateTime handleStopDate;

    /**
     * 办理结果
     */
    private String handleResult;

    /**
     * 办理完成附件
     */
    private String handleFinishAttach;


}
