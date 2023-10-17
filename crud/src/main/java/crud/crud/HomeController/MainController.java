package crud.crud.HomeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import crud.crud.Entities.User;
import crud.crud.UserRepository.ProductRepository;


@Controller
public class MainController {

  @Autowired
  private ProductRepository repo;


  @GetMapping("/")
  public String home(Model m){
    List<User> list = repo.findAll();
    m.addAttribute("all_products", list);
    return "index";
  }

  @GetMapping("/add")
  public String add(){
    return "add";
  }

  @GetMapping("/edit/{id}")
  public String edit(@PathVariable(value = "id") long id,Model m){

    Optional<User> user  =repo.findById(id);
    User u = user.get();
    m.addAttribute("product", u);

    return "edit";
  }



  @PostMapping("/submit")
  public String submitForm(@ModelAttribute User u){
    repo.save(u);
    return "redirect:/";
  }

  @PostMapping("/update")
  public String upadateProduct(@ModelAttribute User u){
    repo.save(u);
    return "redirect:/";
  }

  @GetMapping("/delete/{id}")
  public String deleteProduct(@PathVariable(value = "id") long id){
    repo.deleteById(id);
    return "redirect:/";
  }



}
