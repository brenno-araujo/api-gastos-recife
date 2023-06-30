package com.gastosrecife.apigastosrecife.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gastosrecife.apigastosrecife.service.ExpenseService;
import com.gastosrecife.apigastosrecife.dto.ExpenseCategoryDto;
import com.gastosrecife.apigastosrecife.dto.InfoSourceDTO;
import com.gastosrecife.apigastosrecife.dto.MonthlyExpenseDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/expenses")
@CrossOrigin(origins = "http://localhost:4200")
@Api(tags = "Despesas API")
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/total-per-category")
    @ApiOperation(value = "Obter total de despesas por categoria", notes = "Obtém o total de despesas agrupadas por categoria")
    public List<ExpenseCategoryDto> getTotalPerCategory() {
        return expenseService.getTotalPerCategory();
    }

    @GetMapping("/total-per-month")
    @ApiOperation(value = "Obter total de despesas por mês", notes = "Obtém o total de despesas agrupadas por mês")
    public List<MonthlyExpenseDTO> getTotalExpensesPerMonth() {
        return expenseService.getTotalExpensesPerMonth();
    }

    @GetMapping("/info-source")
    @ApiOperation(value = "Obter informações da fonte de dados", notes = "Obtém informações sobre as fontes de dados das despesas")
    public List<InfoSourceDTO> getInfoSource() {
        return expenseService.getInfoSource();
    }
}
