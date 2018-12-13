package com.teksoi.restapi.repositories;

import com.teksoi.restapi.configuration.RepositoryConfiguration;
import com.teksoi.restapi.model.Role;
import com.teksoi.restapi.model.User;
import com.teksoi.restapi.repository.UserRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {RepositoryConfiguration.class})
public class UserRepositoryTest {

    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public void setProductRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Ignore
    @Test
    public void create(){
        User user = new User();
        user.setFirstName("Jahid");
        user.setLastName("Islam");
        user.setEmail("mozahidone@gmail.com");
        Role role1 = new Role();
        role1.setId((long)1);

        List<Role> roles = new ArrayList<>();
        roles.add(role1);
        user.setRoles(roles);
        userRepository.save(user);
    }

    //@Ignore
    @Test
    @Transactional
    public void update(){
        Optional<User> user = userRepository.findById((long)1);

        User user1 = user.get();
        user1.setFirstName("Mozahid updated");
        Role role1 = new Role();
        List<Role> roles = new ArrayList<>();
        user1.getRoles().add(role1);
        userRepository.save(user1);
    }

    @Ignore
    @Test
    public void get() {
        Optional<User> user = userRepository.findById((long) 1);
        assertNotNull(user.get());
    }

    @Ignore
    @Test
    public void delete() {
        Optional<User> user = userRepository.findById((long) 1);
        assertNotNull(user.get());
    }

}
