package com.gastosrecife.apigastosrecife.repository;

import com.gastosrecife.apigastosrecife.model.ExpenseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ExpenseRepository extends JpaRepository<ExpenseModel, UUID> {

    // Get total expenses agruped by month
    @Query(value = "SELECT COUNT(mes_movimentacao) AS count, mes_movimentacao AS codigo, CAST(mes_movimentacao AS CHAR) AS nome, SUM(valor_empenhado) AS valor_empenhado, SUM(valor_liquidado) AS valor_liquidado, SUM(valor_pago) AS valor_pago"
            + " FROM despesas_2017 GROUP BY mes_movimentacao", nativeQuery = true)
    List<Object[]> getTotalExpensesPerMonth();

    // Get total expenses per category
    @Query(value = "SELECT COUNT(categoria_economica_codigo) AS count, categoria_economica_codigo AS codigo, categoria_economica_nome AS nome, SUM(valor_empenhado) AS valor_empenhado, SUM(valor_liquidado) AS valor_liquidado, SUM(valor_pago) AS valor_pago"
            + " FROM despesas_2017 GROUP BY categoria_economica_codigo, categoria_economica_nome", nativeQuery = true)
    List<Object[]> getTotalPerCategory();
}