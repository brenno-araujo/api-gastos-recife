package com.gastosrecife.apigastosrecife.dto;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class InfoSourceDTO {
    private Number count;
    private Number fonteRecursoCodigo;
    private String fonteRecursoNome;
    private double valorEmpenhado;
    private double valorLiquidado;
    private double valorPago;

    public Number getCount() {
        return count;
    }

    public void setCount(Number count) {
        this.count = count;
    }

    public Number getFonteRecursoCodigo() {
        return fonteRecursoCodigo;
    }

    public void setFonteRecursoCodigo(Number fonteRecursoCodigo) {
        this.fonteRecursoCodigo = fonteRecursoCodigo;
    }

    public String getFonteRecursoNome() {
        return fonteRecursoNome;
    }

    public void setFonteRecursoNome(String fonteRecursoNome) {
        this.fonteRecursoNome = fonteRecursoNome;
    }

    public String getValorEmpenhado() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        currencyFormat.setCurrency(Currency.getInstance("BRL"));
        return currencyFormat.format(valorEmpenhado);
    }

    public void setValorEmpenhado(double valorEmpenhado) {
        this.valorEmpenhado = valorEmpenhado;
    }

    public String getValorLiquidado() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        currencyFormat.setCurrency(Currency.getInstance("BRL"));
        return currencyFormat.format(valorLiquidado);
    }

    public void setValorLiquidado(double valorLiquidado) {
        this.valorLiquidado = valorLiquidado;
    }

    public String getValorPago() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        currencyFormat.setCurrency(Currency.getInstance("BRL"));
        return currencyFormat.format(valorPago);
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
