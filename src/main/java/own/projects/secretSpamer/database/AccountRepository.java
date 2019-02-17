package own.projects.secretSpamer.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import own.projects.secretSpamer.model.Account;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long>{
    List<Account> findAll();
    Account findAccountByAId(Long aId);
    Optional<Account> findAccountByAUsername(String aUsername);
}
