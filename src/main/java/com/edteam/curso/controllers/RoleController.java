package com.edteam.curso.controllers;

import com.edteam.curso.models.Role;
import com.edteam.curso.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    RoleService roleService;

    // Trae todos los usuarios
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Role> getAll() {
        return roleService.getAll();
    }

    // Trae todos los usuarios
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Role get(@PathVariable long id) {
        return roleService.get(id);
    }

    // Registrar usuario
    @RequestMapping(value = "/", method = RequestMethod.POST)
    Role register(@RequestBody Role role) {
        return roleService.register(role);
    }

    // Registrar usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Role update(@RequestBody Role role) {
        return roleService.update(role);
    }

    // Registrar usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        roleService.delete(id);
    }
}
