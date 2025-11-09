package pe.edu.upc.aaw.smartsupplybackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.smartsupplybackend.entities.Support;

import java.util.List;

@Repository
public interface ISupportRepository extends JpaRepository<Support,Integer> {


    @Query(value = "SELECT\n" +
            "    EXTRACT(YEAR FROM date_support) AS año,\n" +
            "    TO_CHAR(date_support, 'TMMonth') AS nombre_mes,\n" +
            "    COUNT(*) AS num_soportes\n" +
            "FROM\n" +
            "    support\n" +
            "WHERE\n" +
            "    EXTRACT(YEAR FROM date_support) = EXTRACT(YEAR FROM CURRENT_DATE)\n" +
            "GROUP BY\n" +
            "    EXTRACT(YEAR FROM date_support), TO_CHAR(date_support, 'TMMonth')\n" +
            "ORDER BY\n" +
            "    año, MIN(date_support);",nativeQuery = true)
    List<String[]> inciddenciasXMes();
}
