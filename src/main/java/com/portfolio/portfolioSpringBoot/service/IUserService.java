
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.User;
import java.util.List;


public interface IUserService {
    public boolean validarUser(User user);
    public List<User> verUser();
}
