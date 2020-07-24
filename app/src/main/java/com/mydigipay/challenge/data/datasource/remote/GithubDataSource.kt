package com.mydigipay.challenge.data.datasource.remote

import com.mydigipay.challenge.data.model.UserEntity
import com.mydigipay.challenge.domain.model.RemoteRepository
import com.mydigipay.challenge.domain.model.User
import io.reactivex.Single

interface GithubDataSource {
    fun search(query: String): Single<List<RemoteRepository>>
    fun getUser(): Single<User>
}