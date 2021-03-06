package com.samiu.host.model.repository

import com.samiu.host.global.NETWORK_ERROR
import com.samiu.host.model.http.BaseWanRepository
import com.samiu.host.model.http.WanClient

/**
 * @author Samiu 2020/3/7
 */
class WanSearchRepository : BaseWanRepository() {

    suspend fun getSearchArticle(page: Int, key: String) = readyCall(
        call = {
            call(WanClient.service.searchHot(page, key))
        }, errorMessage = NETWORK_ERROR
    )

    suspend fun getHotKey() = readyCall(
        call = {
            call(WanClient.service.getHot())
        }, errorMessage = NETWORK_ERROR
    )
}