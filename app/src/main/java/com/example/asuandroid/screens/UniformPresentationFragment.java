package com.example.asuandroid.screens;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.collection.ArraySet;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asuandroid.R;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter;
import com.example.asuandroid.outfitfragments.AwardFragment;
import com.example.asuandroid.vectorBuildAdapters.RibbonItem;
import com.zoomage.ZoomageView;


import java.io.File;
import java.util.ArrayList;

public class UniformPresentationFragment extends Fragment{
    public static ArrayList<Integer> fromAward = AwardFragment.finalExport;
    private ArrayList<RibbonItem> mRibbonList;
    private RecyclerView mRecyclerView;
    private RibbonAdapter mRecyclerViewAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        createRibbonList();
        final View view = inflater.inflate(R.layout.fragment_uniform_presentation, container, false);
        final FragmentActivity c = getActivity();
        RibbonAdapter mAdapter = new RibbonAdapter(mRibbonList);
        mRecyclerViewAdapter = new RibbonAdapter(mRibbonList);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewRibbonRack);
        LinearLayoutManager layoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        // Inflate the layout for this fragment
        return view;
    }

    public void createRibbonList() {
        mRibbonList = new ArrayList<>();
        //for(int i = 0; i < fromAward.size(); i++)
        System.out.println(fromAward);
        fromAward.trimToSize();
        System.out.println(fromAward);

        int tots = fromAward.size();
        System.out.println("Size of tots"  + tots);
        /*
        if(fromAward.size() == 1){
            mRibbonList.add(new RibbonItem.RibbonItem1(fromAward));
        } else if(fromAward.size() ==2){
            mRibbonList.add(new RibbonItem.RibbonItem2(fromAward));
        }
        */
        switch(tots) {
            case 1:
                mRibbonList.add(new RibbonItem.RibbonItem1(fromAward));
                break;
            case 2:
                mRibbonList.add(new RibbonItem.RibbonItem2(fromAward));
                break;
            case 3:
                mRibbonList.add(new RibbonItem.RibbonItem3(fromAward));
                break;
            case 4:
                mRibbonList.add(new RibbonItem.RibbonItem4(fromAward));
                break;
        }

    }

    private Bitmap getBitmapFromView(View view) {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(),Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        //Get the view's background
        Drawable bgDrawable =view.getBackground();
        if (bgDrawable!=null) {
            //has background drawable, then draw it on the canvas
            bgDrawable.draw(canvas);
        }   else{
            //does not have background drawable, then draw white background on the canvas
            canvas.drawColor(Color.WHITE);
        }
        // draw the view on the canvas
        view.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_return_home_fromPresentation).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fromAward.removeAll(fromAward);
                View layout_view = view.findViewById(R.id.ribbonRack);
                System.out.println("FromawardSize"+ fromAward.size());
                NavHostFragment.findNavController(UniformPresentationFragment.this)
                        .navigate(R.id.action_uniformPresentationFragment_to_HomeScreen);
            }

        });
    }
}