package th.sc.ku.menu.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.sc.ku.menu.model.Menu;

import java.util.List;
import java.util.UUID;

@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
    Menu findByName(String name);
    List<Menu> findByCategory(String category);

}

