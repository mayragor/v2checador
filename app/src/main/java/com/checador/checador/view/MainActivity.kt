package com.checador.checador.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.checador.checador.R
import com.checador.checador.contract.ContractInterface
import com.checador.checador.model.People
import com.checador.checador.presenter.CheckerPresenter
import com.checador.checador.utils.AdapterPeople


class MainActivity : AppCompatActivity(), ContractInterface.View {
    private var presenter: CheckerPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = CheckerPresenter(this)

        var lista: RecyclerView = findViewById(R.id.rvList) as RecyclerView
        var array: List<People>? = presenter?.getData()
        var array2 = ComunicatorFragmentsBusiness.makeList(array)
        lista.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = AdapterPeople(
                array2,
                R.layout.card_people,
                context
            )
        }
    }

    override fun initView() {
        var mat = findViewById(R.id.idMati) as TextView
        mat.setText("hola matias")
        // presenter?.getData()

    }

    /*override fun updateViewData() {
        //presenter?.getData()
        var lista: RecyclerView = findViewById(R.id.rvList) as RecyclerView
        var array: List<People>? = presenter?.getData()
        var array2 = ComunicatorFragmentsBusiness.makeList(array)
        lista.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = AdapterPeople(
                array2,
                R.layout.card_people,
                context
            )
        }
    }*/


    companion object ComunicatorFragmentsBusiness {
        var data = mutableListOf<People>()
        fun makeList(listItem: List<People>?): List<People> {
            data = listItem as MutableList<People>
            return data
        }
    }


}