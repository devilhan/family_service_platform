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
 * 短信接受表
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblMessageReceive implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 记录编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 拓展号码
     */
    private String extendPhone;

    /**
     * 短信内容
     */
    private String messageContent;

    /**
     * 回复时间
     */
    private LocalDateTime replyDate;

    /**
     * 位置序号
     */
    private String positionOrder;

    /**
     * 接受时间
     */
    private LocalDateTime receiveDate;

    /**
     * 读取标记
     */
    private Integer readTag;

    /**
     * 读取时间
     */
    private LocalDateTime readDate;


}
