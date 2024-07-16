package org.myproject.shortlink.admin.config;

import org.myproject.shortlink.admin.common.biz.user.UserTransmitFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * User configuration auto load
 */
@Configuration
public class UserConfiguration {

    /**
     * User Info Transmit Filter
     */
    @Bean
    public FilterRegistrationBean<UserTransmitFilter> globalUserTransmitFilter(StringRedisTemplate stringRedisTemplate) {
        FilterRegistrationBean<UserTransmitFilter> registrationBean= new FilterRegistrationBean<>();
        registrationBean.setFilter(new UserTransmitFilter(stringRedisTemplate));
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(0);
        return registrationBean;
    }
}
