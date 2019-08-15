package com.vincentj.jetpackproject.livedata.viewmodel;

import android.os.AsyncTask;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.vincentj.jetpackproject.livedata.model.NicePlace;
import com.vincentj.jetpackproject.livedata.repositoties.NicePlaceRepository;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LiveDataViewModel extends ViewModel {
    private MutableLiveData<List<NicePlace>> mNicePlaces;
    private MutableLiveData<Boolean> mIsUpdating = new MutableLiveData<>();

    public void init() {
        if (mNicePlaces != null) {
            return;
        }
        NicePlaceRepository mNicePlaceRepository = NicePlaceRepository.getInstance();
        mNicePlaces = mNicePlaceRepository.getNicePlaces();
    }

    public MutableLiveData<List<NicePlace>> getNicePlaces() {
        return mNicePlaces;
    }

    public MutableLiveData<Boolean> getIsUpdating() {
        return mIsUpdating;
    }

    public void addNewPlace(final NicePlace pNicePlace) {
        mIsUpdating.setValue(true);
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                List<NicePlace> curList = mNicePlaces.getValue();
                curList.add(pNicePlace);
                mNicePlaces.postValue(curList);
                mIsUpdating.setValue(false);
            }

            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    TimeUnit.MILLISECONDS.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.execute();

    }
}
