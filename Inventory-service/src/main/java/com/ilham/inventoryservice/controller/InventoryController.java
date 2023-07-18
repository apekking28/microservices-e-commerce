package com.ilham.inventoryservice.controller;

import com.ilham.inventoryservice.dto.InventoryResponse;
import com.ilham.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    // http://localhost:8082/api/inventory/iphone-13,iphone-13-red -> path variable

    // http://localhost:8082/api/inventory?skuCode=iphone-13&skuCode=iphone-13-red -> request param
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
