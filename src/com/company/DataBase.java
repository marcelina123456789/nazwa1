package com.company;

import java.util.*;

public class DataBase {
    static Map<Long,User> db = new HashMap<>();

    public void add(User user){
        db.put(user.getId(), user);
    }
    public User findmyid(Long id){
        return db.get(id);
    }
    public void updateName(String noweimie, Long id){
        User user = findmyid(id);
        user.setImie(noweimie);

    }
    public void daleteuser(Long id){
        db.remove(id);
    }
    public boolean isexist(Long id){
        return findmyid(id) != null;
    }
    public Collection<User> lista(){
        return db.values();
    }
}
