package by.bsuir.psp4.repo;

import by.bsuir.psp4.model.Phone;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * DESCRIPTION
 *
 * @author Vladislav_Karpeka
 * @version 1.0.0
 */
public interface PhoneRepository extends CrudRepository<Phone, UUID> {
}
