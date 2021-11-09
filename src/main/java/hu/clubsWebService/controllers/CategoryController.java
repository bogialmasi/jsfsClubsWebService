package hu.clubsWebService.controllers;

import hu.clubsWebService.domain.Category;
import hu.clubsWebService.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
