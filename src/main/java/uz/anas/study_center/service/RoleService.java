package uz.anas.study_center.service;

import org.springframework.stereotype.Service;
import uz.anas.study_center.entity.Role;
import uz.anas.study_center.entity.enums.RoleName;

@Service
public interface RoleService {

    boolean exists(RoleName name);
    void save(Role role);

}
