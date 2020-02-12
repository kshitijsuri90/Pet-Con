package com.example.kshitij.patentlite;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class StatusFragment extends Fragment { ;

    private View rootview;
    private TextView carbonEmission;
    private TextView treeCount;
    private int footprint;

    public StatusFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_status, container, false);
        carbonEmission = rootview.findViewById(R.id.carbon_emission);
        treeCount = rootview.findViewById(R.id.status);
        footprint = getActivity().getIntent().getExtras().getInt("footprint");
        carbonEmission.setText(""+footprint);
        int trees = footprint/800;
        treeCount.setText(trees + "");
        /*HorizontalBarChart chart =  rootview.findViewById(R.id.chart);
        BarDataSet set1;
        set1 = new BarDataSet(getDataSet(), "Data Set");
        set1.setColors(Color.parseColor("#0000ff"), Color.parseColor("#F78B5D"),Color.parseColor("#ff0000"));
        BarData data = new BarData(set1);
        chart.setData(data);
        chart.getAxisLeft().setDrawGridLines(false);
        chart.getXAxis().setDrawGridLines(false);
        chart.getAxisRight().setDrawGridLines(false);
        chart.getDescription().setEnabled(false);
        chart.setVisibleXRange(0,2);
        chart.setVisibleYRange(0f,2f, YAxis.AxisDependency.LEFT);
        chart.setVisibleYRange(0f,2f, YAxis.AxisDependency.RIGHT);*/
        return rootview;
    }

    private ArrayList<BarEntry> getDataSet() {

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e2 = new BarEntry(1, 9);
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(2, 11);
        valueSet1.add(v1e3);
        return valueSet1;
    }



}
