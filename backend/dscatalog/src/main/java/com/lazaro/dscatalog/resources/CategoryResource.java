package com.lazaro.dscatalog.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazaro.dscatalog.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	private Category category = new Category(10L, "Eletrônico");
	
	@GetMapping
	public String getCategoria() {
		return  category.getId() + " " + category.getName();
	}

}
