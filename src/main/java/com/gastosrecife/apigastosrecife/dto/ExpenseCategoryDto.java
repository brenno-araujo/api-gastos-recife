package com.gastosrecife.apigastosrecife.dto;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class ExpenseCategoryDto {
    private Number count;
    private Number codigo;
    private String nome;
    private Double valor_empenhado;
    private Double valor_liquidado;
    private Double valor_pago;

    public String getValor_pago() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        currencyFormat.setCurrency(Currency.getInstance("BRL"));
        return currencyFormat.format(valor_pago);
    }

    public void setValor_pago(Double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public String getValor_liquidado() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        currencyFormat.setCurrency(Currency.getInstance("BRL"));
        return currencyFormat.format(valor_liquidado);
    }

    public void setValor_liquidado(Double valor_liquidado) {
        this.valor_liquidado = valor_liquidado;
    }

    public String getValor_empenhado() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        currencyFormat.setCurrency(Currency.getInstance("BRL"));
        return currencyFormat.format(valor_empenhado);
    }

    public void setValor_empenhado(Double valor_empenhado) {
        this.valor_empenhado = valor_empenhado;
    }

    public Number getCodigo() {
        return codigo;
    }

    public void setCodigo(Number codigo) {
        this.codigo = codigo;
    }

    public Number getCount() {
        return count;
    }

    public void setCount(Number result) {
        this.count = result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCount(Object result) {
    }

}