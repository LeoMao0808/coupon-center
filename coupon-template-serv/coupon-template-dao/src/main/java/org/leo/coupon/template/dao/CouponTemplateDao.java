package org.leo.coupon.template.dao;

import org.leo.coupon.template.dao.entity.CouponTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 模块名称:dao层
 * 模块描述:TODO
 *
 * @author xiaochuang.mao
 * @date 2022/1/8 14:42
 */
public interface CouponTemplateDao extends JpaRepository<CouponTemplate,Long> {
    /**
     * 根据Shop ID查询出所有券模板
     *
     * @param shopId 商品id
     * @return java.util.List<org.leo.coupon.template.dao.entity.CouponTemplate>
     */
    List<CouponTemplate> findCouponTemplateByShopId(Long shopId);

    /**
     * Id in + 分页支持的语法
     *
     * @param Id
     * @param page
     * @return org.springframework.data.domain.Page<org.leo.coupon.template.dao.entity.CouponTemplate>
     */
   Page<CouponTemplate> findAllByIdIn(List<Long> Id, Pageable page);

    /**
     * 获取当前商品可用的优惠卷模板
     *
     * @param shopId
     * @param available
     * @return java.lang.Integer
     */
    Integer countByShopIdAndAvailable(Long shopId,Boolean available);
    /**
     * 将优惠券设置为不可用
     *
     * @param id 优惠券模板id
     * @return int
     */
    @Modifying
    @Query("update CouponTemplate ct set ct.available = false where ct.id = :id ")
   boolean makeCouponTemplateUnavailable(Long id);
}
