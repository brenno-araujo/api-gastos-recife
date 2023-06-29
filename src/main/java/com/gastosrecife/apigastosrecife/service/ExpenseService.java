package com.gastosrecife.apigastosrecife.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastosrecife.apigastosrecife.repository.ExpenseRepository;
import com.gastosrecife.apigastosrecife.dto.ExpenseCategoryDto;
import com.gastosrecife.apigastosrecife.dto.MonthlyExpenseDTO;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<ExpenseCategoryDto> getTotalPerCategory() {
        List<Object[]> results = expenseRepository.getTotalPerCategory();
        List<ExpenseCategoryDto> expenseCategoryDtos = new ArrayList<>();

        for (Object[] result : results) {
            ExpenseCategoryDto expenseCategoryDto = new ExpenseCategoryDto();
            expenseCategoryDto.setCount(((Number) result[0]));
            expenseCategoryDto.setCodigo(((Number) result[1]));
            expenseCategoryDto.setNome((String) result[2]);
            expenseCategoryDto.setValor_empenhado((Double) result[3]);
            expenseCategoryDto.setValor_liquidado((Double) result[4]);
            expenseCategoryDto.setValor_pago((Double) result[5]);

            expenseCategoryDtos.add(expenseCategoryDto);
        }

        return expenseCategoryDtos;
    }

    public List<MonthlyExpenseDTO> getTotalExpensesPerMonth() {
        List<Object[]> results = expenseRepository.getTotalExpensesPerMonth();
        List<MonthlyExpenseDTO> monthlyExpenseDtos = new ArrayList<>();

        for (Object[] result : results) {
            MonthlyExpenseDTO monthlyExpenseDto = new MonthlyExpenseDTO();
            monthlyExpenseDto.setCount(((Number) result[0]));
            monthlyExpenseDto.setCodigo((Number) result[1]);
            monthlyExpenseDto.setMes(result[2].toString());
            monthlyExpenseDto.setValor_empenhado((Double) result[3]);
            monthlyExpenseDto.setValor_liquidado((Double) result[4]);
            monthlyExpenseDto.setValor_pago((Double) result[5]);

            monthlyExpenseDtos.add(monthlyExpenseDto);
        }

        Collections.sort(monthlyExpenseDtos,
                Comparator.comparing(dto -> ((MonthlyExpenseDTO) dto).getCodigo().intValue()));

        return monthlyExpenseDtos;
    }

}
