package com.checador.checador.presenter

import com.checador.checador.contract.ContractInterface
import com.checador.checador.model.CheckerModel
import com.checador.checador.model.People

class CheckerPresenter(_view: ContractInterface.View) : ContractInterface.Presenter {
    private var view: ContractInterface.View = _view
    private var model: ContractInterface.Model = CheckerModel()

    init {
        view.initView()
        //view.updateViewData()
    }

    override fun getData(): List<People> {
        return model.getData().toList()
    }

}