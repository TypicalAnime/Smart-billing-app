package com.example.smart.billing.service;

import com.example.smart.billing.io.ItemRequest;
import com.example.smart.billing.io.ItemResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ItemService {

    ItemResponse add(ItemRequest request, MultipartFile file);

    List<ItemResponse> fetchItems();

    void deleteItem(String itemId);


}
