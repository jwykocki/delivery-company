/*import application.User;
import application.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfUsers() {
        userRepository.save(new User("Bob", "bob@domain.com"));
        List<User> users = (List<User>) userRepository.findAll();

        assertThat(users.size()).isEqualTo(1);
    }
}{
}
*/