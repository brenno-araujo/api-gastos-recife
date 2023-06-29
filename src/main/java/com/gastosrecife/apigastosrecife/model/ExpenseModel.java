package com.gastosrecife.apigastosrecife.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "despesas_2017")
public class ExpenseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _id;
    @Column(nullable = false, precision = 4)
    private int anoMovimentacao;
    @Column(nullable = false, precision = 2)
    private int mesMovimentacao;
    @Column(nullable = false, precision = 3)
    private int orgaoCodigo;
    @Column(nullable = false, length = 90)
    private String orgaoNome;
    @Column(nullable = false, precision = 5)
    private float unidadeCodigo;
    @Column(nullable = false, length = 98)
    private String unidadeNome;
    @Column(nullable = false, precision = 2)
    private int categoriaEconomicaCodigo;
    @Column(nullable = false, length = 19)
    private String categoriaEconomicaNome;
    @Column(nullable = false, precision = 2)
    private int grupoDespesaCodigo;
    @Column(nullable = false, length = 26)
    private String grupoDespesaNome;
    @Column(nullable = false, precision = 2)
    private int modalidadeAplicacaoCodigo;
    @Column(nullable = false, length = 26)
    private String modalidadeAplicacaoNome;
    @Column(nullable = false, precision = 2)
    private int elementoCodigo;
    @Column(nullable = false, length = 67)
    private String elementoNome;
    @Column(nullable = false, precision = 2)
    private int subelementoCodigo;
    @Column(nullable = false, length = 90)
    private String subelementoNome;
    @Column(nullable = false, precision = 2)
    private int funcaoCodigo;
    @Column(nullable = false, length = 21)
    private String funcaoNome;
    @Column(nullable = false, precision = 4)
    private int subfuncaoCodigo;
    @Column(nullable = false, length = 48)
    private String subfuncaoNome;
    @Column(nullable = false, precision = 4)
    private int programaCodigo;
    @Column(nullable = false, length = 104)
    private String programaNome;
    @Column(nullable = false, precision = 4)
    private int acaoCodigo;
    @Column(nullable = false, length = 129)
    private String acaoNome;
    @Column(nullable = false, precision = 4)
    private int fonteRecursoCodigo;
    @Column(nullable = false, length = 55)
    private String fonteRecursoNome;
    @Column(nullable = false, precision = 4)
    private int empenhoAno;
    @Column(nullable = false, length = 21)
    private String empenhoModalidadeNome;
    @Column(nullable = false, precision = 2)
    private int empenhoModalidadeCodigo;
    @Column(nullable = false, precision = 6)
    private int empenhoNumero;
    @Column(nullable = false, precision = 4)
    private int subempenho;
    @Column(nullable = false, length = 1)
    private String indicadorSubempenho;
    @Column(nullable = false, precision = 8)
    private int credorCodigo;
    @Column(nullable = false, length = 118)
    private String credorNome;
    @Column(nullable = false, precision = 4)
    private int modalidadeLicitacaoCodigo;
    @Column(nullable = false, length = 31)
    private String modalidadeLicitacaoNome;
    @Column(nullable = false, precision = 12)
    private String valorEmpenhado;
    @Column(nullable = false, precision = 11)
    private String valorLiquidado;
    @Column(nullable = false, precision = 11)
    private String valorPago;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getanoMovimentacao() {
        return anoMovimentacao;
    }

    public void setanoMovimentacao(int anoMovimentacao) {
        this.anoMovimentacao = anoMovimentacao;
    }

    public int getmesMovimentacao() {
        return mesMovimentacao;
    }

    public void setmesMovimentacao(int mesMovimentacao) {
        this.mesMovimentacao = mesMovimentacao;
    }

    public int getorgaoCodigo() {
        return orgaoCodigo;
    }

    public void setorgaoCodigo(int orgaoCodigo) {
        this.orgaoCodigo = orgaoCodigo;
    }

    public String getorgaoNome() {
        return orgaoNome;
    }

    public void setorgaoNome(String orgaoNome) {
        this.orgaoNome = orgaoNome;
    }

    public float getunidadeCodigo() {
        return unidadeCodigo;
    }

    public void setunidadeCodigo(float unidadeCodigo) {
        this.unidadeCodigo = unidadeCodigo;
    }

    public String getunidadeNome() {
        return unidadeNome;
    }

    public void setunidadeNome(String unidadeNome) {
        this.unidadeNome = unidadeNome;
    }

    public int getcategoriaEconomicaCodigo() {
        return categoriaEconomicaCodigo;
    }

    public void setcategoriaEconomicaCodigo(int categoriaEconomicaCodigo) {
        this.categoriaEconomicaCodigo = categoriaEconomicaCodigo;
    }

    public String getcategoriaEconomicaNome() {
        return categoriaEconomicaNome;
    }

    public void setcategoriaEconomicaNome(String categoriaEconomicaNome) {
        this.categoriaEconomicaNome = categoriaEconomicaNome;
    }

    public int getgrupoDespesaCodigo() {
        return grupoDespesaCodigo;
    }

    public void setgrupoDespesaCodigo(int grupoDespesaCodigo) {
        this.grupoDespesaCodigo = grupoDespesaCodigo;
    }

    public String getgrupoDespesaNome() {
        return grupoDespesaNome;
    }

    public void setgrupoDespesaNome(String grupoDespesaNome) {
        this.grupoDespesaNome = grupoDespesaNome;
    }

    public int getmodalidadeAplicacaoCodigo() {
        return modalidadeAplicacaoCodigo;
    }

    public void setmodalidadeAplicacaoCodigo(int modalidadeAplicacaoCodigo) {
        this.modalidadeAplicacaoCodigo = modalidadeAplicacaoCodigo;
    }

    public String getmodalidadeAplicacaoNome() {
        return modalidadeAplicacaoNome;
    }

    public void setmodalidadeAplicacaoNome(String modalidadeAplicacaoNome) {
        this.modalidadeAplicacaoNome = modalidadeAplicacaoNome;
    }

    public int getelementoCodigo() {
        return elementoCodigo;
    }

    public void setelementoCodigo(int elementoCodigo) {
        this.elementoCodigo = elementoCodigo;
    }

    public String getelementoNome() {
        return elementoNome;
    }

    public void setelementoNome(String elementoNome) {
        this.elementoNome = elementoNome;
    }

    public int getSubelementoCodigo() {
        return subelementoCodigo;
    }

    public void setSubelementoCodigo(int subelementoCodigo) {
        this.subelementoCodigo = subelementoCodigo;
    }

    public String getSubelementoNome() {
        return subelementoNome;
    }

    public void setSubelementoNome(String subelementoNome) {
        this.subelementoNome = subelementoNome;
    }

    public int getfuncaoCodigo() {
        return funcaoCodigo;
    }

    public void setfuncaoCodigo(int funcaoCodigo) {
        this.funcaoCodigo = funcaoCodigo;
    }

    public String getfuncaoNome() {
        return funcaoNome;
    }

    public void setfuncaoNome(String funcaoNome) {
        this.funcaoNome = funcaoNome;
    }

    public int getSubfuncaoCodigo() {
        return subfuncaoCodigo;
    }

    public void setSubfuncaoCodigo(int subfuncaoCodigo) {
        this.subfuncaoCodigo = subfuncaoCodigo;
    }

    public String getSubfuncaoNome() {
        return subfuncaoNome;
    }

    public void setSubfuncaoNome(String subfuncaoNome) {
        this.subfuncaoNome = subfuncaoNome;
    }

    public int getprogramaCodigo() {
        return programaCodigo;
    }

    public void setprogramaCodigo(int programaCodigo) {
        this.programaCodigo = programaCodigo;
    }

    public String getprogramaNome() {
        return programaNome;
    }

    public void setprogramaNome(String programaNome) {
        this.programaNome = programaNome;
    }

    public int getacaoCodigo() {
        return acaoCodigo;
    }

    public void setacaoCodigo(int acaoCodigo) {
        this.acaoCodigo = acaoCodigo;
    }

    public String getacaoNome() {
        return acaoNome;
    }

    public void setacaoNome(String acaoNome) {
        this.acaoNome = acaoNome;
    }

    public int getfonteRecursoCodigo() {
        return fonteRecursoCodigo;
    }

    public void setfonteRecursoCodigo(int fonteRecursoCodigo) {
        this.fonteRecursoCodigo = fonteRecursoCodigo;
    }

    public String getfonteRecursoNome() {
        return fonteRecursoNome;
    }

    public void setfonteRecursoNome(String fonteRecursoNome) {
        this.fonteRecursoNome = fonteRecursoNome;
    }

    public int getempenhoAno() {
        return empenhoAno;
    }

    public void setempenhoAno(int empenhoAno) {
        this.empenhoAno = empenhoAno;
    }

    public String getempenhoModalidadeNome() {
        return empenhoModalidadeNome;
    }

    public void setempenhoModalidadeNome(String empenhoModalidadeNome) {
        this.empenhoModalidadeNome = empenhoModalidadeNome;
    }

    public int getempenhoModalidadeCodigo() {
        return empenhoModalidadeCodigo;
    }

    public void setempenhoModalidadeCodigo(int empenhoModalidadeCodigo) {
        this.empenhoModalidadeCodigo = empenhoModalidadeCodigo;
    }

    public int getempenhoNumero() {
        return empenhoNumero;
    }

    public void setempenhoNumero(int empenhoNumero) {
        this.empenhoNumero = empenhoNumero;
    }

    public int getSubempenho() {
        return subempenho;
    }

    public void setSubempenho(int subempenho) {
        this.subempenho = subempenho;
    }

    public String getindicadorSubempenho() {
        return indicadorSubempenho;
    }

    public void setindicadorSubempenho(String indicadorSubempenho) {
        this.indicadorSubempenho = indicadorSubempenho;
    }

    public int getcredorCodigo() {
        return credorCodigo;
    }

    public void setcredorCodigo(int credorCodigo) {
        this.credorCodigo = credorCodigo;
    }

    public String getcredorNome() {
        return credorNome;
    }

    public void setcredorNome(String credorNome) {
        this.credorNome = credorNome;
    }

    public int getmodalidadeLicitacaoCodigo() {
        return modalidadeLicitacaoCodigo;
    }

    public void setmodalidadeLicitacaoCodigo(int modalidadeLicitacaoCodigo) {
        this.modalidadeLicitacaoCodigo = modalidadeLicitacaoCodigo;
    }

    public String getmodalidadeLicitacaoNome() {
        return modalidadeLicitacaoNome;
    }

    public void setmodalidadeLicitacaoNome(String modalidadeLicitacaoNome) {
        this.modalidadeLicitacaoNome = modalidadeLicitacaoNome;
    }

    public String getvalorEmpenhado() {
        return valorEmpenhado;
    }

    public void setvalorEmpenhado(String valorEmpenhado) {
        this.valorEmpenhado = valorEmpenhado;
    }

    public String getvalorLiquidado() {
        return valorLiquidado;
    }

    public void setvalorLiquidado(String valorLiquidado) {
        this.valorLiquidado = valorLiquidado;
    }

    public String getvalorPago() {
        return valorPago;
    }

    public void setvalorPago(String valorPago) {
        this.valorPago = valorPago;
    }

}