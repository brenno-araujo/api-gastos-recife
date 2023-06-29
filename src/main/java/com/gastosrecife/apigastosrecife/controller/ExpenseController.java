package com.gastosrecife.apigastosrecife.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gastosrecife.apigastosrecife.model.ExpenseModel;
import com.gastosrecife.apigastosrecife.service.ExpenseService;
import com.google.gson.JsonObject;
import com.gastosrecife.apigastosrecife.dto.ExpenseCategoryDto;
import com.gastosrecife.apigastosrecife.dto.MonthlyExpenseDTO;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/total-per-category")
    public List<ExpenseCategoryDto> getTotalPerCategory() {
        List<ExpenseCategoryDto> result = expenseService.getTotalPerCategory();

        return result;
    }

    // Get total expenses agruped by month
    @GetMapping("/total-per-month")
    public List<MonthlyExpenseDTO> getTotalExpensesPerMonth() {
        return expenseService.getTotalExpensesPerMonth();
    }

}
