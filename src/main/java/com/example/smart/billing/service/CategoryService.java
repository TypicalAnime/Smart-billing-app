package com.example.smart.billing.service;

import com.example.smart.billing.io.CategoryRequest;
import com.example.smart.billing.io.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request, MultipartFile file);


    List<CategoryResponse> read();

    void delete(String categoryId);
}
