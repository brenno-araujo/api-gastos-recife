package com.gastosrecife.apigastosrecife.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gastosrecife.apigastosrecife.dto.ExpenseDTO;
import com.gastosrecife.apigastosrecife.service.ExpenseService;
import com.google.gson.JsonObject;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping(value = "/total-per-month/{month}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getDespesasTotaisPorMes(@PathVariable int month) {
        String result = expenseService.getTotalExpensesPerMonth(month);
        JsonObject jsonObject = new JsonObject();
        if (result.startsWith("Erro")) {
            jsonObject.addProperty("status", "error");
            jsonObject.addProperty("result", result);
            return ResponseEntity.badRequest().body(jsonObject.toString());
        }
        jsonObject.addProperty("status", "success");
        jsonObject.addProperty("result", result);
        return ResponseEntity.ok(jsonObject.toString());
    }

    @GetMapping("/total-per-category")
    public List<ExpenseDTO> getTotalPerCategory() {
        return expenseService.getTotalPerCategory();
    }

    @GetMapping("/total-per-source")
    public List<ExpenseDTO> getTotalExpensesPerSource() {
        return expenseService.getTotalExpensesPerSource();
    }
}
