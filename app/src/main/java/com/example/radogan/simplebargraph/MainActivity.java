package com.example.radogan.simplebargraph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart b1;
    BarDataSet dataset;
    BarData data;
    String jsonResult;

    ArrayList<BarEntry> datos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (BarChart) findViewById(R.id.bar1);

        //valores de x,y
        datos.add(new BarEntry(0, 5));
        datos.add(new BarEntry(1, 10));
        datos.add(new BarEntry(2, 15));
        datos.add(new BarEntry(3, 20));
        datos.add(new BarEntry(4, 25));

        BarDataSet dataset = new BarDataSet(datos, "# de algo");
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //colres preestablecidos, si no las barras son del mismo color

        BarData data = new BarData(dataset);
        b1.setData(data); //asignar finalmente los datos al gráfico

    }
}
