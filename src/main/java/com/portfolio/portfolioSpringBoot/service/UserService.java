
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.User;
import com.portfolio.portfolioSpringBoot.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    
    @Autowired
    public UserRepository userRepo;

    @Override
    public boolean validarUser(User user) {
        
        boolean i = false;
        
        List<User> u = userRepo.findAll();
        
        for (User userLog:u ){
            if ((userLog.user_name.equals(user.user_name)) && (userLog.user_password.equals(user.user_password))){
                i= true;
            }
        }
        return i;
    }
    
}
