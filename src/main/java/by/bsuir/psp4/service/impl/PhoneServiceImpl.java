package by.bsuir.psp4.service.impl;

import by.bsuir.psp4.model.Phone;
import by.bsuir.psp4.repo.PhoneRepository;
import by.bsuir.psp4.service.PhoneService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * DESCRIPTION
 *
 * @author Vladislav_Karpeka
 * @version 1.0.0
 */
@Service
@AllArgsConstructor
public class PhoneServiceImpl implements PhoneService {

  private final PhoneRepository repository;

  @Override
  public Phone save(Phone phone) {
    return repository.save(phone);
  }

  @Override
  public Phone getById(UUID id) {
    return repository.findById(id).orElseThrow(RuntimeException::new);
  }

  @Override
  public List<Phone> getAll() {
    return (List<Phone>) repository.findAll();
  }

  @Override
  public void delete(UUID id) {
    repository.delete(getById(id));
  }
}
