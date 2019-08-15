package com.vincentj.jetpackproject.livedata.repositoties;

import androidx.lifecycle.MutableLiveData;
import com.vincentj.jetpackproject.livedata.model.NicePlace;

import java.util.ArrayList;
import java.util.List;

public class NicePlaceRepository {
    private static NicePlaceRepository instance;
    private List<NicePlace> data = new ArrayList<>();

    private NicePlaceRepository() {

    }

    public static NicePlaceRepository getInstance() {
        if (instance == null) {
            instance = new NicePlaceRepository();
        }
        return instance;
    }

    public MutableLiveData<List<NicePlace>> getNicePlaces() {
        setData();
        MutableLiveData<List<NicePlace>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(data);
        return mutableLiveData;
    }

    private void setData() {
        data.add(new NicePlace("A", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882529298&di=352fbf0808317973d5d1c12b0d84b4e4&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201702%2F22%2F20170222200954_zeJWu.thumb.700_0.jpeg"));
        data.add(new NicePlace("B", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882529297&di=ec4353893c1abab90fc649292b72a4cd&imgtype=0&src=http%3A%2F%2Fm.360buyimg.com%2Fpop%2Fjfs%2Ft23434%2F230%2F1763906670%2F10667%2F55866a07%2F5b697898N78cd1466.jpg"));
        data.add(new NicePlace("C", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882529297&di=5bf9153ae7841452254dec1a467f2ddb&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201503%2F31%2F20150331155006_kd5rr.jpeg"));
        data.add(new NicePlace("D", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882609253&di=1edd245ccb7c921d24a1ae8ce3c29b90&imgtype=jpg&src=http%3A%2F%2Fimg1.imgtn.bdimg.com%2Fit%2Fu%3D2579044471%2C4108191309%26fm%3D214%26gp%3D0.jpg"));
        data.add(new NicePlace("E", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882529296&di=21a8f9bc4ff173e552626ed64a99e2f5&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201608%2F21%2F20160821230024_MyCYK.thumb.700_0.jpeg"));
        data.add(new NicePlace("F", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882529294&di=976791d0437595d85c16b0e254ba2642&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201407%2F22%2F20140722182918_tV8aa.jpeg"));
        data.add(new NicePlace("G", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882666842&di=f0db749ee27110a95cb1c296a535c8f4&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201510%2F23%2F20151023153643_yYJxs.thumb.700_0.jpeg"));
        data.add(new NicePlace("H", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882666842&di=feb23504bb0a98570231654dc380e62d&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201508%2F20%2F20150820103436_fnQad.jpeg"));
        data.add(new NicePlace("I", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882666841&di=860b1be147dbc4cb0856803546b4bf2c&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201608%2F23%2F20160823210831_vV2Pr.jpeg"));
        data.add(new NicePlace("J", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882666840&di=e43f4edb568ea74cbbf97e30ddde98da&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201508%2F05%2F20150805140012_B8uQv.png"));
        data.add(new NicePlace("K", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882666839&di=0e036ac46ecb2c12289d6df90ae212c0&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201805%2F27%2F20180527155946_cxzah.jpg"));
        data.add(new NicePlace("L", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882666835&di=bb6f37496641f27ee614e6887ec4a49b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201506%2F26%2F20150626120340_feaiR.jpeg"));
        data.add(new NicePlace("M", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882727521&di=5c83b2dd39b8c3535f3731a6e4bdbadb&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201603%2F26%2F20160326171515_5arEB.jpeg"));
        data.add(new NicePlace("N", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565882727520&di=3f9fe7b8b71ccd3575381c82f5c8ee26&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201603%2F04%2F20160304144356_mHnU4.jpeg"));
    }
}
