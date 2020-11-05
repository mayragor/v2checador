package com.checador.checador.model

import com.checador.checador.contract.ContractInterface

data class People(
    var name: String = "",
    var entrada: String = "",
    var salida: String = ""
)

class CheckerModel : ContractInterface.Model {
    // private var people:List<People> = listOf(People("hola","1","2"),
    //    People("hola","1","2"),People("hola","1","2"))

    override fun getData(): List<People> {
        var people: List<People> = listOf(
            People("hola1", "1", "2"),
            People("hola2", "1", "2"),
            People("hola3", "1", "2")
        )

        return people
    }

}