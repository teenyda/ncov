package me.teenyda.nCoV.model.home.base.model;

import io.reactivex.Observable;
import me.teenyda.nCoV.base.net.BaseResponse;

public interface IHomeModel {

    Observable<BaseResponse> rx_getBookList();
}
