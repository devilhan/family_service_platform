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
 * 业委会会议
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyCommitteeMetting implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 会议日期
     */
    private LocalDateTime meetingDate;

    /**
     * 会议主题
     */
    private String meetingTitle;

    /**
     * 会议地点
     */
    private String meetingAddr;

    /**
     * 会议内容
     */
    private String meetingContent;

    /**
     * 主持人
     */
    private String hoster;

    /**
     * 记录员
     */
    private String recorder;

    /**
     * 参见人员
     */
    private String joiner;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
