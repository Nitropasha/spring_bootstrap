

package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.repository.RoleRep;
import ru.kata.spring.boot_security.demo.repository.UserRep;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;
import java.util.Set;

@Service

public class UserServiceImp implements UserService {

    private final UserRep userRep;
    private final RoleRep roleRep;

    public UserServiceImp(UserRep userRep, RoleRep roleRep) {
        this.userRep = userRep;
        this.roleRep = roleRep;
    }



    public List<Role> getAllRoles() {
        return roleRep.findAll();
    }


}
