package com.demo.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author gaoguangyao
 * @since 2019-02-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "store_id", type = IdType.AUTO)
    private Integer storeId;

    /**
     * 链接
     */
    private String url;

    /**
     * 门店名称
     */
    private String name;

    /**
     * 城市
     */
    private String city;

    /**
     * 区域
     */
    private String region;

    /**
     * 电话
     */
    private String tel;

    /**
     * 地址
     */
    private String address;

    /**
     * 营业时间
     */
    private String openHours;

    /**
     * 人均
     */
    private String avgPrice;

    /**
     * 口味评分
     */
    private String scoreTaste;

    /**
     * 环境评分
     */
    private String scoreEnvironment;

    /**
     * 服务评分
     */
    private String scoreService;

    /**
     * 经度(腾讯地图/火星坐标系)
     */
    private BigDecimal longitude;

    /**
     * 纬度(腾讯地图/火星坐标系)
     */
    private BigDecimal latitude;

    /**
     * 导航栏
     */
    private String breadCrumbs;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    /**
     * 美食
     */
    private String info1;

    /**
     * 类别，例如火锅
     */
    private String info2;

    private String info3;

    private String info4;

    private String info5;


}
