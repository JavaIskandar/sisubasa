package com.example.iskandarjava.suratbebaslab;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iskandarjava.suratbebaslab.DaftarPengajuanFragment.OnListFragmentInteractionListener;
import com.example.iskandarjava.suratbebaslab.dummy.DummyContent.DummyItem;

import java.util.List;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<DummyItem> mValues;
    private final OnListFragmentInteractionListener mListener;
    private Activity parentActivity;



    public MyItemRecyclerViewAdapter(List<DummyItem> items, OnListFragmentInteractionListener listener, Activity parentActivity) {
        mValues = items;
        mListener = listener;
        this.parentActivity=parentActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView=mValues.get(position).id;
        holder.mContentView.setText(mValues.get(position).content);
        holder.mNim.setText(mValues.get(position).id);

//        holder.checkBox.setChecked(objIncome.isSelected());
//        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//            }
//        });

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(parentActivity);
                LayoutInflater inflater = (LayoutInflater)
                        parentActivity.getSystemService(LAYOUT_INFLATER_SERVICE);
                //Inflate the view from a predefined XML layout
                View layout = inflater.inflate(R.layout.dialog_mahasiswa,null);
                mBuilder.setView(layout);
                AlertDialog dialog= mBuilder.create();
                dialog.show();

                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.

                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
        holder.mView.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public String mIdView="";
        public final TextView mContentView;
        public final TextView mNim;
        public DummyItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mContentView = (TextView) view.findViewById(R.id.content);
            mNim= (TextView) view.findViewById(R.id.nim);


            //this.setIsRecyclable(false);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
