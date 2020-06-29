package jp.co.internous.ecsite.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import jp.co.internous.ecsite.model.entity.User;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByUserNameAndPassword(String userName, String password);

}