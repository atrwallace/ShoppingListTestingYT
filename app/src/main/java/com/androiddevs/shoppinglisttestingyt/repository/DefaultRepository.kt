package com.androiddevs.shoppinglisttestingyt.repository

import com.androiddevs.shoppinglisttestingyt.data.local.ShoppingDao
import com.androiddevs.shoppinglisttestingyt.data.remote.PixabayAPI
import javax.inject.Inject


class DefaultRepository @Inject constructor(private val shoppingDao: ShoppingDao, private val pixabayAPI: PixabayAPI) {


}