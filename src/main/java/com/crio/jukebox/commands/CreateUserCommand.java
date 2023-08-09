package com.crio.jukebox.commands;

import java.util.List;
import com.crio.jukebox.entites.User;
import com.crio.jukebox.services.IUserService;

public class CreateUserCommand implements ICommand{
    
    private final IUserService userService;
    
    public CreateUserCommand(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute(List<String> tokens) {
       User user= userService.createUser(tokens.get(1));
       System.out.println(user.getId()+" "+user.getUserName());
    }
}
