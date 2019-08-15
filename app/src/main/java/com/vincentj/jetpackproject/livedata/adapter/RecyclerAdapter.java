package com.vincentj.jetpackproject.livedata.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.vincentj.jetpackproject.R;
import com.vincentj.jetpackproject.livedata.model.NicePlace;
import de.hdodenhof.circleimageview.CircleImageView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<NicePlace> mNicePlaces = new ArrayList<>();
    private Context mContext;

    public RecyclerAdapter(Context context, List<NicePlace> pNicePlaces) {
        this.mContext = context;
        this.mNicePlaces = pNicePlaces;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_livedata, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTitle.setText(mNicePlaces.get(position).getTitle());
        RequestOptions requestOptions = new RequestOptions().error(R.drawable.ic_launcher_background);
        Glide.with(mContext)
                .setDefaultRequestOptions(requestOptions)
                .load(mNicePlaces.get(position).getImgUrl())
                .into(holder.circleImageView);
    }

    @Override
    public int getItemCount() {
        return mNicePlaces.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView circleImageView;
        TextView tvTitle;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            circleImageView = itemView.findViewById(R.id.item_livedata_civ);
            tvTitle = itemView.findViewById(R.id.item_livedata_title_tv);
        }
    }
}
