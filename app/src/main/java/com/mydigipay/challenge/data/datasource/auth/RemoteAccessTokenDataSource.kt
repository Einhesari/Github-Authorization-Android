package com.mydigipay.challenge.data.datasource.auth

import com.mydigipay.challenge.network.oauth.RequestAccessToken
import com.mydigipay.challenge.network.oauth.ResponseAccessToken
import kotlinx.coroutines.Deferred

interface RemoteAccessTokenDataSource {
    fun accessToken(requestAccessToken: RequestAccessToken): Deferred<ResponseAccessToken>
}