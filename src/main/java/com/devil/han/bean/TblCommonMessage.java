package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 常用短信
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblCommonMessage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 短信编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 短信内容
     */
    private String messageContent;

    /**
     * 类型
     */
    private Long messageType;


}
