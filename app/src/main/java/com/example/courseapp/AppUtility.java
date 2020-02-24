package com.example.courseapp;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;


public class AppUtility {

    private  String[] prac_name;
    private  String[] prac_content;
    private Context context;

    private List<Practical> practicalList;

    private static AppUtility appUtility;

    public AppUtility(Context context) {
        this.context=context;
        prac_name=context.getResources().getStringArray(R.array.practical_names);
        prac_content= context.getResources().getStringArray(R.array.practical_content);

        practicalList=new ArrayList<Practical>();
        for(int i=0;i<prac_name.length;i++){
            Practical practical=new Practical(prac_name[i],prac_content[i]);
            practicalList.add(practical);
        }
    }

    public static AppUtility getAppUtility(Context context){
        if(appUtility==null){
            appUtility=new AppUtility(context);
        }
        return appUtility;
    }

    public List<Practical> getPracticalList(){
        return this.practicalList;
    }

    public String[] getNames() {
        return this.prac_name;
    }

    public String[] getContent(){
        return  this.prac_content;

    }
}
