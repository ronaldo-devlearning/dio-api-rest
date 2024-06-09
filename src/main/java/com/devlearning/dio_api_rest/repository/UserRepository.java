package com.devlearning.dio_api_rest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.devlearning.dio_api_rest.model.User;

@Repository
public class UserRepository {

	public void save(User user){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }
	
    public void update(User user){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }
    
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    
    public List<User> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Francisco","password"));
        users.add(new User("Ronaldo","masterpass"));
        return users;
    }
    public User finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("Francisco","password");
    }

}