package com.macro.mall.service.asset;

import com.macro.mall.dto.AssetGgimgParam;
import com.macro.mall.model.AssetGgimg;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品品牌管理Service
 * Created by macro on 2018/4/26.
 */
public interface AssetGgimgService {
    /**
     * 获取所有品牌
     */
    List<AssetGgimg> listAllBrand();

    /**
     * 创建资产
     */
    int createBrand(AssetGgimgParam AssetGgimgParam);

    /**
     * 修改品牌
     */
    @Transactional
    int updateBrand(Long id, AssetGgimgParam AssetGgimgParam);

    /**
     * 删除品牌
     */
    int deleteBrand(Long id);

    /**
     * 批量删除品牌
     */
    int deleteBrand(List<Long> ids);

    /**
     * 分页查询资产
     */
    List<AssetGgimg> listBrand(String keyword, Integer showStatus, int pageNum, int pageSize);

    /**
     * 获取品牌详情
     */
    AssetGgimg getBrand(Long id);

    /**
     * 修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 修改展示状态
     */
    int updateFactoryStatus(List<Long> ids, String zszt);

}
