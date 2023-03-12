package sn.esmt.emploi.doa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.emploi.entities.AppEmploiEntity;
@Repository
public interface AppEmploiRepository extends JpaRepository<AppEmploiEntity, Integer> {
    AppEmploiEntity findById(int id);
    AppEmploiEntity findByEmail(String email);
}
