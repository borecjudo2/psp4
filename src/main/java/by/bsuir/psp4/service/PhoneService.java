package by.bsuir.psp4.service;

import by.bsuir.psp4.model.Phone;

import java.util.List;
import java.util.UUID;

/**
 * DESCRIPTION
 *
 * @author Vladislav_Karpeka
 * @version 1.0.0
 */
public interface PhoneService {

  Phone save(Phone phone);

  Phone getById(UUID id);

  List<Phone> getAll();

  void delete(UUID id);
}
