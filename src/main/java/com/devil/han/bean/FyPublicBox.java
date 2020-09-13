package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 公表信息
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyPublicBox implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 公表编号
     */
    private String publicBoxId;

    /**
     * 所属费项
     */
    private Integer moneyId;

    /**
     * 公表读数
     */
    private Double publicBoxReadNumber;

    /**
     * 分摊方法
     */
    private String shareMethod;

    /**
     * 公表状态
     */
    private String publicBoxState;


}
