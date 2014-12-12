package org.example.readit.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author    Rick Qiu
 * Email     qiudejun@gmail.com
 * Date      12/12/14
 * Time      2:19 PM
 */
@Service
public class ReadItUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> authsList = new ArrayList<GrantedAuthority>();
        authsList.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return "ROLE_USER";
            }
        });
        return new User("roy", "spring", true, true, true, true, authsList);
    }
}
