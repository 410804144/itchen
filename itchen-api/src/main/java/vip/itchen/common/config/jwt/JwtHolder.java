package vip.itchen.common.config.jwt;

import vip.itchen.model.resp.ac.LoginResp;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author ckh
 * @date 2021-04-09
 */
public class JwtHolder {

    /**
     * 获取登录用户UID
     */
    public static Long currentUid() {
        LoginResp resp = currentUser();
        return null == resp ? null : resp.getUid();
    }

    /**
     * 获取登录用户信息
     */
    public static LoginResp currentUser() {
        return (LoginResp) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
