package com.pharmacure.online_pharmacy_app.datasource.local

import androidx.lifecycle.LiveData
import com.pharmacure.online_pharmacy_app.result.SResult
import com.pharmacure.online_pharmacy_app.viewobjects.Customer


interface ICustomerLocalDataSource {

    suspend fun getAll(): LiveData<SResult<Customer>>

    suspend fun insert(data: Customer)

    suspend fun signOut()
}