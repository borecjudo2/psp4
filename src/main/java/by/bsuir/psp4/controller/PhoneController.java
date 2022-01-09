package by.bsuir.psp4.controller;

import by.bsuir.psp4.model.Phone;
import by.bsuir.psp4.service.PhoneService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

/**
 * DESCRIPTION
 *
 * @author Vladislav_Karpeka
 * @version 1.0.0
 */
@Controller
@RequestMapping
@AllArgsConstructor
public class PhoneController {

  private final PhoneService service;

  @RequestMapping(value = "/add", method = RequestMethod.GET)
  public String showAddPhoneView(ModelMap model) {
    return getPhoneViewWithBody(model, new Phone());
  }

  @PostMapping("/add")
  public String savePhone(ModelMap model, Phone phone, BindingResult result) {
    if (result.hasErrors()) {
      return "phone";
    }
    service.save(phone);
    return "redirect:/all";
  }

  @RequestMapping(value = "/update", method = RequestMethod.GET)
  public String showUpdateTodoPage(@RequestParam UUID id, ModelMap model) {
    return getPhoneViewWithBody(model, service.getById(id));
  }

  @PostMapping("/update")
  public String updatePhone(ModelMap model, Phone phone, BindingResult result) {
    if (result.hasErrors()) {
      return "phone";
    }
    service.save(phone);
    return "redirect:/all";
  }

  @GetMapping("/all")
  public String getAllPhones(ModelMap modelMap) {
    modelMap.put("phones", service.getAll());
    return "phones";
  }

  @GetMapping("/delete")
  public String deletePhone(@RequestParam UUID id) {
    service.delete(id);
    return "redirect:/all";
  }

  private String getPhoneViewWithBody(ModelMap modelMap, Phone phone) {
    modelMap.put("phone", phone);
    return "phone";
  }
}
