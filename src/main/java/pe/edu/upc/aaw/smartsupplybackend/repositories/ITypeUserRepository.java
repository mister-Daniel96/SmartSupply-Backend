package pe.edu.upc.aaw.smartsupplybackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.smartsupplybackend.entities.TypeUser;

@Repository
public interface ITypeUserRepository extends JpaRepository<TypeUser,Long> {
}
