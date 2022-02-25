package org.leo.coupon.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 模块名称:启动类
 * 模块描述:TODO
 *
 * @author xiaochuang.mao
 * @date 2022/1/10 12:53
 */
@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = {"org.leo"})
public class CouponTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponTemplateApplication.class);
    }
}
