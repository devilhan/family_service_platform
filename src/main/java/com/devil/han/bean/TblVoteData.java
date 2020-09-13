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
 * 投票数据表
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblVoteData implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 投票编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 投票项目编号
     */
    private Integer voteProjectId;

    /**
     * 投票用户编码
     */
    private String voteUserId;

    /**
     * 投票用户名称
     */
    private String voteUserName;

    /**
     * 投票时间
     */
    private LocalDateTime voteDate;


}
