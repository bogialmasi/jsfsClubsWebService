package hu.clubsWebService.controllers;

import hu.clubsWebService.domain.Category;
import hu.clubsWebService.domain.Club;
import hu.clubsWebService.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    private CategoryService service;

    @Autowired
    public void setService(CategoryService service) {
        this.service = service;
    }

    @GetMapping("/categories")
    public List<Category> categories(){
        return service.getCategories();
    }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable("id") int id){
        return service.getCategoryById(id);
    }

    @GetMapping("/categories/{id}/clubs")
    public List<Club> getClubsByCategory(@PathVariable("id") int id){
        return service.getClubsByCategory(id);
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category){
        return service.addCategory(category);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable("id") int id){
        service.deleteCategory(id);
    }
}
