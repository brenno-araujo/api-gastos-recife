package com.gastosrecife.apigastosrecife.dto;

public class MonthlyExpenseDTO {
    private Number count;
    private Number codigo;
    private String mes;
    private double valor_empenhado;
    private double valor_liquidado;
    private double valor_pago;

    public String getValor_pago() {
        return String.format("%.2f", valor_pago);
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public String getValor_liquidado() {
        return String.format("%.2f", valor_liquidado);
    }

    public void setValor_liquidado(double valor_liquidado) {
        this.valor_liquidado = valor_liquidado;
    }

    public String getValor_empenhado() {
        return String.format("%.2f", valor_empenhado);
    }

    public void setValor_empenhado(double valor_empenhado) {
        this.valor_empenhado = valor_empenhado;
    }

    public Number getCodigo() {
        return codigo;
    }

    public void setCodigo(Number codigo) {
        this.codigo = codigo.intValue();
    }

    public Number getCount() {
        return count;
    }

    public void setCount(Number result) {
        this.count = result.intValue();
    }

    public String getMes() {
        switch (mes) {
            case "1":
                return "Janeiro";
            case "2":
                return "Fevereiro";
            case "3":
                return "Março";
            case "4":
                return "Abril";
            case "5":
                return "Maio";
            case "6":
                return "Junho";
            case "7":
                return "Julho";
            case "8":
                return "Agosto";
            case "9":
                return "Setembro";
            case "10":
                return "Outubro";
            case "11":
                return "Novembro";
            case "12":
                return "Dezembro";
            default:
                return mes;
        }
    }

    public void setMes(String mes) {
        this.mes = mes.toUpperCase().trim();
    }

}