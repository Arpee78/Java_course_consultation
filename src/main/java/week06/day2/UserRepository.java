package week06.day2;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
       users.add(user);
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public User findUserByName(String name) {
        for (User u : users) {
            if (u.getName().equals(name)){
               return u;
            }
        }
        throw new IllegalArgumentException("Cannot find user with this name: " + name);
    }
}
