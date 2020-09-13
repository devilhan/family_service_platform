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
 * 我的意见
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblMyadvice implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 意见箱
     */
    private Integer adviceBox;

    /**
     * 状态
     */
    private String status;

    /**
     * 附件名称
     */
    private String attachName;

    /**
     * 发表人id
     */
    private String publisherId;

    /**
     * 发表人名称
     */
    private String publisherName;

    /**
     * 发表时间
     */
    private LocalDateTime publisherDate;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 回复人id
     */
    private String replyId;

    /**
     * 回复人名称
     */
    private String replyName;

    /**
     * 回复时间
     */
    private LocalDateTime replyDate;


}
