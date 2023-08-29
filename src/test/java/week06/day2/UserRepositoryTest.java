package week06.day2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository userRepository;

    @BeforeEach
    void init() {
        userRepository = new UserRepository();
        userRepository.addUser(new User("John", "smith@gmail.com"));
        userRepository.addUser(new User("Jane", "jane@gmail.com"));
        userRepository.addUser(new User("Joe", "joe@gmail.com"));
    }

    @Test
    void testFindUserByName() {
        assertEquals("Jane", userRepository.findUserByName("Jane").getName());
        assertEquals(3, userRepository.getUsers().size());
        assertEquals("joe@gmail.com", userRepository.findUserByName("Joe").getEmail());
    }

    @Test
    void testFindUserByNameNotFound() {
        String name = "Jimmy";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> userRepository.findUserByName(name));
        assertEquals("Cannot find user with this name: " + name, iae.getMessage());
    }

}