package br.edu.ifsp.pep.controller;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;
import org.primefaces.model.charts.optionconfig.legend.Legend;
import org.primefaces.model.charts.optionconfig.legend.LegendLabel;
import org.primefaces.model.charts.optionconfig.title.Title;

@Named
@RequestScoped
public class VendaController {

    private BarChartModel barModel;
    
    public VendaController(){
        this.gerarGraficoVendaPorMes();
    }

    public void gerarGraficoVendaPorMes() {
        barModel = new BarChartModel();
        ChartData data = new ChartData();

        // Cria um dataset.
        BarChartDataSet barDataSet = new BarChartDataSet();
        // Label da legenda.
        barDataSet.setLabel("Vendas");
        
        // Valores de vendas para cada mes.
        List<Number> values = new ArrayList<>();
        values.add(65);
        values.add(59);
        values.add(80);
        values.add(81);
        values.add(56);
        values.add(55);
        values.add(40);
        
        // Atribui os valores de vendas ao dataset.
        barDataSet.setData(values);
        
        List<String> bgColor = new ArrayList<>();
        bgColor.add("rgba(255, 99, 132, 0.2)");
        bgColor.add("rgba(255, 159, 64, 0.2)");
        bgColor.add("rgba(255, 205, 86, 0.2)");
        bgColor.add("rgba(75, 192, 192, 0.2)");
        bgColor.add("rgba(54, 162, 235, 0.2)");
        bgColor.add("rgba(153, 102, 255, 0.2)");
        bgColor.add("rgba(201, 203, 207, 0.2)");
        barDataSet.setBackgroundColor(bgColor);

        List<String> borderColor = new ArrayList<>();
        borderColor.add("rgb(255, 99, 132)");
        borderColor.add("rgb(255, 159, 64)");
        borderColor.add("rgb(255, 205, 86)");
        borderColor.add("rgb(75, 192, 192)");
        borderColor.add("rgb(54, 162, 235)");
        borderColor.add("rgb(153, 102, 255)");
        borderColor.add("rgb(201, 203, 207)");
        barDataSet.setBorderColor(borderColor);
        barDataSet.setBorderWidth(1);
        
        // Atribui o dataset aos dados do gráfico.
        data.addChartDataSet(barDataSet);
        
        //Cria uma lista de label (eixo y do gráfico)
        List<String> labels = new ArrayList<>();
        labels.add("Janeiro");
        labels.add("Fevereiro");
        labels.add("Março");
        labels.add("Abril");
        labels.add("Maio");
        labels.add("Junho");
        labels.add("Julho");
        
        //Atribui os Labels aos dados do gráfico.
        data.setLabels(labels);
        
        //Atribui os dados ao gráfico.
        barModel.setData(data);
        
        barDataSet = new BarChartDataSet();
        // Label da legenda.
        barDataSet.setLabel("Despesas");
        
        // Valores de vendas para cada mes.
        values = new ArrayList<>();
        values.add(65);
        values.add(59);
        values.add(80);
        values.add(81);
        values.add(56);
        values.add(55);
        values.add(40);
        
        // Atribui os valores de vendas ao dataset.
        barDataSet.setData(values);
        
        bgColor = new ArrayList<>();
        bgColor.add("rgba(255, 99, 132, 0.2)");
        bgColor.add("rgba(255, 159, 64, 0.2)");
        bgColor.add("rgba(255, 205, 86, 0.2)");
        bgColor.add("rgba(75, 192, 192, 0.2)");
        bgColor.add("rgba(54, 162, 235, 0.2)");
        bgColor.add("rgba(153, 102, 255, 0.2)");
        bgColor.add("rgba(201, 203, 207, 0.2)");
        barDataSet.setBackgroundColor(bgColor);

        borderColor = new ArrayList<>();
        borderColor.add("rgb(255, 99, 132)");
        borderColor.add("rgb(255, 159, 64)");
        borderColor.add("rgb(255, 205, 86)");
        borderColor.add("rgb(75, 192, 192)");
        borderColor.add("rgb(54, 162, 235)");
        borderColor.add("rgb(153, 102, 255)");
        borderColor.add("rgb(201, 203, 207)");
        barDataSet.setBorderColor(borderColor);
        barDataSet.setBorderWidth(1);
        
        // Atribui o dataset aos dados do gráfico.
        data.addChartDataSet(barDataSet);
        
        //Cria uma lista de label (eixo y do gráfico)
        labels = new ArrayList<>();
        labels.add("Janeiro");
        labels.add("Fevereiro");
        labels.add("Março");
        labels.add("Abril");
        labels.add("Maio");
        labels.add("Junho");
        labels.add("Julho");
        
        //Atribui os Labels aos dados do gráfico.
        data.setLabels(labels);
        
        //Atribui os dados ao gráfico.
        barModel.setData(data);
        
        BarChartOptions options = new BarChartOptions();
        CartesianScales cScales = new CartesianScales();
        
        
        
        // Adiciona Titulo ao Gráfico
        Title title = new Title();
        title.setDisplay(true);
        title.setFontSize(30);
        title.setText("Gráfico de Vendas e Despesas");
        options.setTitle(title);
        
        //Options
        
        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
        linearAxes.setOffset(true);
        CartesianLinearTicks ticks = new CartesianLinearTicks();
        ticks.setBeginAtZero(true);
        linearAxes.setTicks(ticks);
        cScales.addYAxesData(linearAxes);
        options.setScales(cScales);
        
        barModel.setOptions(options);
        
        Legend legend = new Legend();
        legend.setDisplay(true);
        legend.setPosition("bottom");
        LegendLabel legendLabels = new LegendLabel();
        legendLabels.setFontStyle("bold");
        legendLabels.setFontColor("#2980B9");
        legendLabels.setFontSize(24);
        legend.setLabels(legendLabels);
        options.setLegend(legend);
               


    }
    
    public BarChartModel getBarModel() {
        return barModel;
    }
}
