package by.bsuir.psp4.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * DESCRIPTION
 *
 * @author Vladislav_Karpeka
 * @version 1.0.0
 */
@RestController
public class ErrorController {

  @ExceptionHandler(Exception.class)
  public ModelAndView handleException(HttpServletRequest request, Exception ex) {
    ex.printStackTrace();
    ModelAndView mv = new ModelAndView();

    mv.addObject("exception", ex.getLocalizedMessage());
    mv.addObject("url", request.getRequestURL());

    mv.setViewName("error");
    return mv;
  }
}
