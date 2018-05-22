package com.lydex.gestion_sst.dao.chantier;

        import com.lydex.gestion_sst.entities.chantier.Visite_hs;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;

        import javax.websocket.server.PathParam;
        import java.util.List;

public interface VisiteHsRepository extends JpaRepository<Visite_hs,Long> {
    @Query("select v from Visite_hs v where v.description like:x")
    public Page<Visite_hs> chercher(@Param("x") String mc, Pageable pageable);

    @Query("select v from Visite_hs v where v.user.id_user = :id")
    public List<Visite_hs> getMyVisiteHs(@Param("id") Long id);
}
