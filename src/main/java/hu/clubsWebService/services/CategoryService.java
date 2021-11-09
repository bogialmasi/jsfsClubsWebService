// service-ben valósul meg az üzleti logika

package hu.clubsWebService.services;

import hu.clubsWebService.domain.Category;
import hu.clubsWebService.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> getCategories() {
        return repository.findAll();
    }
}
