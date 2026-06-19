package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserRepositoryTest {

    @Mock
    private UserRepository userRepository;

    @Test
    void testFindByName() {

        User user = new User(1L, "User1");

        when(userRepository.findByName("User1"))
                .thenReturn(Arrays.asList(user));

        List<User> users = userRepository.findByName("User1");

        assertEquals(1, users.size());
        assertEquals("User1", users.get(0).getName());
    }
}