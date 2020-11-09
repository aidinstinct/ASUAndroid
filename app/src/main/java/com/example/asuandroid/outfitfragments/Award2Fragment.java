package com.example.asuandroid.outfitfragments;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.asuandroid.R;
import com.example.asuandroid.dialogs.Award2Dialog;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter;
import com.example.asuandroid.outfitfragments.AwardFragment;
import com.example.asuandroid.vectorBuildAdapters.RibbonItem;


import java.util.ArrayList;

public class Award2Fragment extends Fragment{
    public static ArrayList<Integer> fromAward = AwardFragment.finalExport;
    private ArrayList<RibbonItem> mRibbonList;
    private RecyclerView mRecyclerView;
    private RibbonAdapter mRecyclerViewAdapter;
    public static ArrayList<Drawable> bitmapDrawableArray = new ArrayList<Drawable>();
    public static Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        assert container != null;
        context = container.getContext();
        createRibbonList();
        final View view = inflater.inflate(R.layout.fragment_award2, container, false);
        final FragmentActivity c = getActivity();
        RibbonAdapter mAdapter = new RibbonAdapter(mRibbonList);
        mRecyclerViewAdapter = new RibbonAdapter(mRibbonList);
        final RecyclerView recyclerView = view.findViewById(R.id.recyclerViewRibbonRack);
        LinearLayoutManager layoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        // Inflate the layout for this fragment
        return view;
    }
    public void setDrawableZoomage() {

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


            case 5:
                mRibbonList.add(new RibbonItem.RibbonItem5(fromAward));
                break;


            case 6:
                mRibbonList.add(new RibbonItem.RibbonItem6(fromAward));
                break;


            case 7:
                mRibbonList.add(new RibbonItem.RibbonItem7(fromAward));
                break;


            case 8:
                mRibbonList.add(new RibbonItem.RibbonItem8(fromAward));
                break;


            case 9:
                mRibbonList.add(new RibbonItem.RibbonItem9(fromAward));
                break;


            case 10:
                mRibbonList.add(new RibbonItem.RibbonItem10(fromAward));
                break;


            case 11:
                mRibbonList.add(new RibbonItem.RibbonItem11(fromAward));
                break;


            case 12:
                mRibbonList.add(new RibbonItem.RibbonItem12(fromAward));
                break;


            case 13:
                mRibbonList.add(new RibbonItem.RibbonItem13(fromAward));
                break;


            case 14:
                mRibbonList.add(new RibbonItem.RibbonItem14(fromAward));
                break;


            case 15:
                mRibbonList.add(new RibbonItem.RibbonItem15(fromAward));
                break;


            case 16:
                mRibbonList.add(new RibbonItem.RibbonItem16(fromAward));
                break;


            case 17:
                mRibbonList.add(new RibbonItem.RibbonItem17(fromAward));
                break;


            case 18:
                mRibbonList.add(new RibbonItem.RibbonItem18(fromAward));
                break;


            case 19:
                mRibbonList.add(new RibbonItem.RibbonItem19(fromAward));
                break;


            case 20:
                mRibbonList.add(new RibbonItem.RibbonItem20(fromAward));
                break;


            case 21:
                mRibbonList.add(new RibbonItem.RibbonItem21(fromAward));
                break;


            case 22:
                mRibbonList.add(new RibbonItem.RibbonItem22(fromAward));
                break;


            case 23:
                mRibbonList.add(new RibbonItem.RibbonItem23(fromAward));
                break;


            case 24:
                mRibbonList.add(new RibbonItem.RibbonItem24(fromAward));
                break;


            case 25:
                mRibbonList.add(new RibbonItem.RibbonItem25(fromAward));
                break;


            case 26:
                mRibbonList.add(new RibbonItem.RibbonItem26(fromAward));
                break;


            case 27:
                mRibbonList.add(new RibbonItem.RibbonItem27(fromAward));
                break;


            case 28:
                mRibbonList.add(new RibbonItem.RibbonItem28(fromAward));
                break;


            case 29:
                mRibbonList.add(new RibbonItem.RibbonItem29(fromAward));
                break;


            case 30:
                mRibbonList.add(new RibbonItem.RibbonItem30(fromAward));
                break;


            case 31:
                mRibbonList.add(new RibbonItem.RibbonItem31(fromAward));
                break;


            case 32:
                mRibbonList.add(new RibbonItem.RibbonItem32(fromAward));
                break;


            case 33:
                mRibbonList.add(new RibbonItem.RibbonItem33(fromAward));
                break;


            case 34:
                mRibbonList.add(new RibbonItem.RibbonItem34(fromAward));
                break;


            case 35:
                mRibbonList.add(new RibbonItem.RibbonItem35(fromAward));
                break;


            case 36:
                mRibbonList.add(new RibbonItem.RibbonItem36(fromAward));
                break;


            case 37:
                mRibbonList.add(new RibbonItem.RibbonItem37(fromAward));
                break;


            case 38:
                mRibbonList.add(new RibbonItem.RibbonItem38(fromAward));
                break;


            case 39:
                mRibbonList.add(new RibbonItem.RibbonItem39(fromAward));
                break;


            case 40:
                mRibbonList.add(new RibbonItem.RibbonItem40(fromAward));
                break;


            case 41:
                mRibbonList.add(new RibbonItem.RibbonItem41(fromAward));
                break;


            case 42:
                mRibbonList.add(new RibbonItem.RibbonItem42(fromAward));
                break;


            case 43:
                mRibbonList.add(new RibbonItem.RibbonItem43(fromAward));
                break;


            case 44:
                mRibbonList.add(new RibbonItem.RibbonItem44(fromAward));
                break;


            case 45:
                mRibbonList.add(new RibbonItem.RibbonItem45(fromAward));
                break;


            case 46:
                mRibbonList.add(new RibbonItem.RibbonItem46(fromAward));
                break;


            case 47:
                mRibbonList.add(new RibbonItem.RibbonItem47(fromAward));
                break;


            case 48:
                mRibbonList.add(new RibbonItem.RibbonItem48(fromAward));
                break;


            case 49:
                mRibbonList.add(new RibbonItem.RibbonItem49(fromAward));
                break;


            case 50:
                mRibbonList.add(new RibbonItem.RibbonItem50(fromAward));
                break;
        }

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewRibbonRack);
        //ZoomageView zoomageView = view.findViewById(R.id.myZoomageView);
        view.setDrawingCacheEnabled(true);
        //ConstraintLayout uniformConstraint = view.findViewById(R.id.uniform_constraint);
        Button convertView = view.findViewById(R.id.btn_populateFromDialog);
        //ImageView holderConvert = view.findViewById(R.id.convertedHolder);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bpm = Bitmap.createBitmap(recyclerView.getWidth(), recyclerView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bpm);
                recyclerView.draw(canvas);
                Drawable d = new BitmapDrawable(getResources(), bpm);
                //zoomageView.setDrawableResource(d);
                bitmapDrawableArray.add(d);
                System.out.println(bitmapDrawableArray);
                NavHostFragment.findNavController(Award2Fragment.this)
                        .navigate(R.id.action_award2Fragment_to_award2Dialog);
                //System.out.println(bitmap);
            }
        });

        /*


         */
    }
}