package com.edteam.curso.services;

import com.edteam.curso.dao.RoleDao;
import com.edteam.curso.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleDao roleDao;

    public List<Role> getAll() {
        return roleDao.getAll();
    }

    public Role get(long id) {
        return roleDao.get(id);
    }

    public Role register(Role role) {
        return roleDao.register(role);
    }

    public Role update(@RequestBody Role role) {
        return roleDao.update(role);
    }

    public void delete(@PathVariable long id) {
        roleDao.delete(id);
    }
}
