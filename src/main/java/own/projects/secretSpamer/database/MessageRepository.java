package own.projects.secretSpamer.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import own.projects.secretSpamer.model.Message;

import java.util.List;
import java.util.Optional;

@Repository
public interface MessageRepository extends CrudRepository<Message,Long> {
    List<Message> findAll();
    Message findMessageByMId(Long mId);
    Optional<Message> findArtikelByMName(String mName);
}