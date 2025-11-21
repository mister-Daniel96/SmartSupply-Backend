package pe.edu.upc.aaw.smartsupplybackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.smartsupplybackend.entities.ConsultaPrediccionDemanda;

@Repository
public interface IConsultaPrediccionDemandaRepository extends JpaRepository<ConsultaPrediccionDemanda,Long> {
}
