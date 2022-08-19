package school.hei.news.heinews.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.news.heinews.model.User;
import school.hei.news.heinews.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

    // A corriger et à completer...
    public void updateUser(Long id, String firstName, String lastName,String username){
        Optional<User> optionalUser = userRepository.findById(id);

        if(optionalUser.isPresent()){
            User user = optionalUser.get();// recupères l'user une fois qu'on sait qu'il existe.
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setUsername(username);

            userRepository.save(user); // sauvegardes les changements
        }else{
            throw new IllegalArgumentException("Tsy misy ao ilay tiana ovaina.");
        }
    }
}
