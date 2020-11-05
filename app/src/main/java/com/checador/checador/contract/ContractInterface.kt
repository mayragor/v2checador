package com.checador.checador.contract

import com.checador.checador.model.People

interface ContractInterface {

    interface View {
        fun initView()
        //fun updateViewData()
    }

    interface Presenter {
        fun getData():List<People>
    }

    interface Model {
        fun getData(): List<People>
    }


}