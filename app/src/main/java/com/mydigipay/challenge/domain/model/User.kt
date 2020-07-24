package com.mydigipay.challenge.domain.model

import com.google.gson.annotations.SerializedName
import com.mydigipay.challenge.presentation.model.UserItem

data class User(
    var login: String? = null,
    var id: String? = null,
    var nodeId: String? = null,
    var avatarUrl: String? = null,
    var gravatarId: String? = null,
    var url: String? = null,
    var htmlUrl: String? = null,
    var followersUrl: String? = null,
    var followingUrl: String? = null,
    var gistsUrl: String? = null,
    var starredUrl: String? = null,
    var subscriptionsUrl: String? = null,
    var organizationsUrl: String? = null,
    var reposUrl: String? = null,
    var eventsUrl: String? = null,
    var receivedEventsUrl: String? = null,
    var type: String? = null,
    var site_admin: Boolean? = false,
    var name: String? = null,
    var company: String? = null,
    var blog: String? = null,
    var location: String? = null,
    var email: String? = null,
    var hireable: Boolean? = false,
    var bio: String? = null,
    var twitterUsername: String? = null,
    var publicRepos: String? = null,
    var publicGists: String? = null,
    var followers: String? = null,
    var following: String? = null,
    var createdAt: String? = null,
    var updatedAt: String? = null
)
fun User.mapToPresentationModel(): UserItem {
    return UserItem(
        login = login,
        id = id,
        nodeId = nodeId,
        avatarUrl = avatarUrl,
        gravatarId = gravatarId,
        url = url,
        htmlUrl = htmlUrl,
        followersUrl = followersUrl,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        organizationsUrl = organizationsUrl,
        reposUrl = reposUrl,
        eventsUrl = eventsUrl,
        receivedEventsUrl = receivedEventsUrl,
        type = type,
        site_admin = site_admin,
        name = name,
        company = company,
        blog = blog,
        location = location,
        email = email,
        hireable = hireable,
        bio = bio,
        twitterUsername = twitterUsername,
        publicRepos = publicRepos,
        publicGists = publicGists,
        followers = followers,
        following = following,
        createdAt = createdAt,
        updatedAt = updatedAt
    )
}