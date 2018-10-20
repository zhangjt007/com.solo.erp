package com.solo.erp.manager.bo;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

/**
 * 实现Spring Security 中UserDetails接口
 */
public class LoginUserBO implements UserDetails {

    private int id;
    private String staffNo;
    private String staffPhoto;
    private int shopId;
    private String shopName;
    private String name;
    private String salt;
    private List<String> roles;
    private Set<Integer> shops;
    private String username;
    private String password;
    private boolean enabled;
    private Date lastPasswordResetDate;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getStaffPhoto() {
        return staffPhoto;
    }

    public void setStaffPhoto(String staffPhoto) {
        this.staffPhoto = staffPhoto;
    }

    public Set<Integer> getShops() {
        return shops;
    }

    public void setShops(Set<Integer> shops) {
        this.shops = shops;
    }

    @Override
    public String toString() {
        return "LoginUserBO{" +
                "id=" + id +
                ", staffNo='" + staffNo + '\'' +
                ", staffPhoto='" + staffPhoto + '\'' +
                ", shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", name='" + name + '\'' +
                ", salt='" + salt + '\'' +
                ", roles='" + roles + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", lastPasswordResetDate=" + lastPasswordResetDate +
                '}';
    }
}
