package com.gastosrecife.apigastosrecife.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.List;

import org.springframework.stereotype.Service;
import com.gastosrecife.apigastosrecife.dto.ExpenseDTO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Service
public class ExpenseService {

    public ExpenseService() {
    }

    public String getTotalExpensesPerMonth(int mes) {
        String tableName = "d4d8a7f0-d4be-4397-b950-f0c991438111";
        String url = "http://dados.recife.pe.gov.br/api/3/action/datastore_search_sql?sql=SELECT%20*%20FROM%20%22"
                + tableName + "%22%20WHERE%20mes_movimentacao=" + mes;

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            if (statusCode != 200) {
                return "Erro ao buscar despesas totais por mês";
            }
            String responseBody = response.body();
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(responseBody, JsonObject.class);
            JsonArray recordsArray = jsonObject.getAsJsonObject("result").getAsJsonArray("records");
            double total = 0;
            for (int i = 0; i < recordsArray.size(); i++) {
                JsonObject record = recordsArray.get(i).getAsJsonObject();
                String valorPagoString = record.get("valor_pago").getAsString();
                // Substitua a vírgula pelo ponto antes de fazer a conversão
                double valorPago = Double.parseDouble(valorPagoString.replace(",", "."));
                total += valorPago;
            }
            // arrendonda o total para duas casas decimais
            total = Math.round(total);
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            String totalFormatted = decimalFormat.format(total);
            return "R$ " + totalFormatted;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Erro ao buscar despesas totais por mês";
        }
    }

    public List<ExpenseDTO> getTotalPerCategory() {
        return null;
        // Lógica para buscar as despesas totais por categoria no repositório
        // e converter para a lista de DTOs
    }

    public List<ExpenseDTO> getTotalExpensesPerSource() {
        return null;
        // Lógica para buscar as despesas totais por fonte no repositório
        // e converter para a lista de DTOs
    }
}
