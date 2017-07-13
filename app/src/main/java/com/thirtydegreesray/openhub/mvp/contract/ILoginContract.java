/*
 *    Copyright 2017 ThirtyDegressRay
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.thirtydegreesray.openhub.mvp.contract;

import com.thirtydegreesray.openhub.db.DaoSession;
import com.thirtydegreesray.openhub.mvp.presenter.BasePresenter;

/**
 * Created on 2017/7/12.
 *
 * @author ThirtyDegreesRay
 */

public interface ILoginContract {

    interface View extends IBaseView{
        void onGetTokenSuccess(String token);
    }

    abstract class Presenter extends BasePresenter<ILoginContract.View>{

        public Presenter(DaoSession daoSession) {
            super(daoSession);
        }

        public abstract void getToken(String code, String state);

        public abstract String getOAuth2Url();

    }

}
